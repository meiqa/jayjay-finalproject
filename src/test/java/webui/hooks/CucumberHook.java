package webui.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webui.BaseUI;

public class CucumberHook extends BaseUI {

    @Before
    public void before() {
        setUpChrome();
    }

    @After
    public void after() {
        driver.quit();
    }
}