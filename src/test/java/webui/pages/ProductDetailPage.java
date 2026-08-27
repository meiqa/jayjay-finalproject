package webui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webui.BaseUI;

import java.time.Duration;

public class ProductDetailPage extends BaseUI {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    By ttlProductDesc = By.xpath("//*[@id=\'more-information\']/strong");
    By pgphProduct = By.xpath("//*[@id='more-information']/p");
    By btnAddtoCart = By.xpath("//*[@id=\'tbodyid\']/div[2]/div/a");

    public boolean productDescTitleAppears() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ttlProductDesc));
        return driver.findElement(ttlProductDesc).isDisplayed();
    }

    public boolean productParagraphAppears() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pgphProduct));
        return driver.findElement(pgphProduct).isDisplayed();
    }

    public boolean addToCartButtonAppears() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnAddtoCart));
        return driver.findElement(btnAddtoCart).isDisplayed();
    }

    public void clickAddToCartButton() {
        driver.findElement(btnAddtoCart).click();
    }
}
