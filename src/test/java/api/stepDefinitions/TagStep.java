package api.stepDefinitions;

import api.BaseAPI;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;

public class TagStep extends BaseAPI {

    @When("the user send GET list of tags request")
    public void theUserSendGETListOfTagsRequest() {
        response =
                given()
                        .log().all()
                        .header("app-id", appID)
                        .when()
                        .get("tag");
    }
}