package webui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webui.BaseUI;

import java.time.Duration;

public class SignUpPage extends BaseUI {

    By btnSignUp = By.id("signin2") ;
    By txtUsername = By.id("sign-username");
    By txtPassword = By.id("sign-password");
    By btnConfirmSignUp = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    public void clickSignUpMenu() {
        driver.findElement(btnSignUp).click();
    }

    public void enterUsername(String username){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void confirmSignUp() {
        driver.findElement(btnConfirmSignUp).click();
    }

    public String getAlertMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public void acceptAlertMessage(){
        driver.switchTo().alert().accept();
    }
}