package webui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webui.pages.SignUpPage;

import static org.junit.Assert.assertEquals;

public class SignUpStep {

    SignUpPage signUpPage = new SignUpPage();

    @Given("the user is on landing page")
    public void theUserIsOnLandingPage() {
        signUpPage.openLandingPage();
    }

    @When("the user clicks the sign up menu")
    public void theUserClicksTheSignUpMenu() {
        signUpPage.clickSignUpMenu();
    }

    @And("the user entered {string} in sign up username field")
    public void theUserEnteredInUsernameField(String username) {
        signUpPage.enterUsername(username);
    }

    @And("the user entered {string} in sign up password field")
    public void theUserEnteredInPasswordField(String password) {
        signUpPage.enterPassword(password);
    }

    @And("the user clicks confirm sign up button")
    public void theUserClicksConfirmSignUpButton() {
        signUpPage.confirmSignUp();
    }

    @Then("alert message should be displayed as {string}")
    public void alertMessageShouldBeDisplayedAs(String alertMessage) {
        assertEquals(alertMessage, signUpPage.getAlertMessage());
        signUpPage.acceptAlertMessage();
    }
}