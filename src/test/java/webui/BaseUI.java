package webui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseUI {
    public static WebDriver driver;

    public void setUpChrome(){
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    public void openLandingPage(){
        driver.get("https://www.demoblaze.com/index.html");
    }
}