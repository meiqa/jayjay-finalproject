package webui.stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webui.pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @When("the user clicks the login menu")
    public void theUserClicksTheLoginMenu() {
        loginPage.clickLoginMenu();
    }

    @And("the user entered {string} in login username field")
    public void theUserEnteredInLoginUsernameField(String username) {
        loginPage.enterUsername(username);
    }

    @And("the user entered {string} in login password field")
    public void theUserEnteredInLoginPasswordField(String password) {
        loginPage.enterPassword(password);
    }

    @And("the user clicks confirm login button")
    public void theUserClicksConfirmLoginButton() {
        loginPage.confirmLogin();
    }

    @Then("the name of user appears at the right top is {string}")
    public void theNameOfUserAppearsAtTheRightTopIs(String displayName) {
        assertEquals(displayName, loginPage.getDisplayName());
    }
}