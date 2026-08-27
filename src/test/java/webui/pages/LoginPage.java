package webui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webui.BaseUI;

import java.time.Duration;

public class LoginPage extends BaseUI {

    By btnLogin = By.id("login2") ;
    By txtUsername = By.id("loginusername") ;
    By txtPassword = By.id("loginpassword") ;
    By btnConfirmLogin = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");
    By txtDisplayName = By.id("nameofuser") ;

    public void clickLoginMenu() {
        driver.findElement(btnLogin).click();
    }

    public void enterUsername(String username) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void confirmLogin() {
        driver.findElement(btnConfirmLogin).click();
    }

    public String getDisplayName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtDisplayName));
        return driver.findElement(txtDisplayName).getText();
    }
}