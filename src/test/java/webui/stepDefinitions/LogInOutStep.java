package webui.stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webui.pages.LogInOutPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LogInOutStep {

    LogInOutPage logInOutPage = new LogInOutPage();

    @When("the user clicks the login menu")
    public void theUserClicksTheLoginMenu() {
        logInOutPage.clickLoginMenu();
    }

    @And("the user entered {string} in login username field")
    public void theUserEnteredInLoginUsernameField(String username) {
        logInOutPage.enterUsername(username);
    }

    @And("the user entered {string} in login password field")
    public void theUserEnteredInLoginPasswordField(String password) {
        logInOutPage.enterPassword(password);
    }

    @And("the user clicks confirm login button")
    public void theUserClicksConfirmLoginButton() {
        logInOutPage.confirmLogin();
    }

    @Then("the name of user appears at the right top is {string}")
    public void theNameOfUserAppearsAtTheRightTopIs(String displayName) {
        assertEquals(displayName, logInOutPage.getDisplayName());
    }

    @When("the user click the logout menu")
    public void theUserClickTheLogoutMenu() {
        logInOutPage.clickLogOut();
    }

    @Then("the sign up menu appears")
    public void theSignUpMenuAppears() {
        assertTrue(logInOutPage.signUpAppears());
    }
}