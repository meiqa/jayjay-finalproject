package api.stepDefinitions;

import api.BaseAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import java.util.HashMap;
import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class UserStep extends BaseAPI {

    String firstName;
    String lastName;
    String emailAddress;

    @Given("the user has valid app id")
    public void theUserHasValidAppId() {
        apiSetup();
    }

    @When("the user send GET user list request")
    public void theUserSendGETUserListRequest() {
        response =
                given()
                        .log().all()
                        .header("app-id", appID)
                .when()
                        .get("user");
    }

    @When("the user send GET user id by {string}")
    public void theUserSendGETUserBy(String userID) {
        response =
                given()
                        .log().all()
                        .header("app-id", appID)
                .when()
                        .get("user/" + userID);
    }

    @And("the user enter {string} as first name")
    public void theUserEnterAsFirstName(String inputFirstName) {
        firstName = inputFirstName;
    }

    @And("the user enter {string} as last name")
    public void theUserEnterAsLastName(String inputLastName) {
        lastName = inputLastName;
    }

    @And("the user enter {string} as email suffix")
    public void theUserEnterAsEmailAddress(String inputEmailSuffix) {
        emailAddress = firstName + System.currentTimeMillis() + inputEmailSuffix;
    }

    @When("the user send POST create user")
    public void theUserSendPOSTCreateUser() {
        HashMap<String, Object> createMap = new HashMap<>();
        createMap.put("firstName", firstName);
        createMap.put("lastName", lastName);
        createMap.put("email", emailAddress);

        response =
                given()
                        .log().all()
                        .header("app-id", appID)
                        .contentType("application/json")
                        .body(createMap)
                .when()
                        .post("user/create");
    }


    @When("the user send PUT user id by {string}")
    public void theUserSendPUTUserIdBy(String updateUserbyID) {
        HashMap<String, Object> updateMap = new HashMap<>();
        updateMap.put("lastName", lastName);

        response =
                given()
                        .log().all()
                        .header("app-id", appID)
                        .contentType("application/json")
                        .body(updateMap)
                .when()
                        .put("user/"  + updateUserbyID);
    }


    @When("the user send DELETE user id by {string}")
    public void theUserSendDELETEUserIdBy(String deleteUserbyID) {
        response =
                given()
                        .log().all()
                        .header("app-id", appID)
                .when()
                        .delete("user/" + deleteUserbyID);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        response.then()
                .log().all()
                .assertThat().statusCode(statusCode);
    }

    @And("the response should match get user by id json schema")
    public void theResponseShouldMatchGetUserByIdJsonSchema() {
        File getUserIDSchemaFile = new File("src/test/resources/api/jsonSchema/getUserIDSchema.json");

        response.then()
                .log().all()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(getUserIDSchemaFile));
    }

    @And("the response user id should not be null")
    public void theResponseUserIdShouldNotBeNull() {
        String newUserID = response.jsonPath().getString("id");
        assertThat(newUserID, notNullValue());
    }

    @And("the response should match update user by id json schema")
    public void theResponseShouldMatchUpdateUserByIdJsonSchema() {
        File updateUserSchemaFile = new File("src/test/resources/api/jsonSchema/updateUserSchema.json");

        response.then()
                .log().all()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(updateUserSchemaFile));
    }

    @And("the response should match delete user by id json schema")
    public void theResponseShouldMatchDeleteUserByIdJsonSchema() {
        File deleteNonExistingUserSchemaFile = new File("src/test/resources/api/jsonSchema/deleteNonExistingUserSchema.json");

        response.then()
                .log().all()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(deleteNonExistingUserSchemaFile));
    }
}