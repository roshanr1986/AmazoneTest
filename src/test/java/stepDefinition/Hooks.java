package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static Scenario _scenario;

    @Before
    public void before() throws Exception {
        DriverFactory.getInstance().initializeDriver();
        driver=DriverFactory.getInstance().getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        //driver.close();
        DriverFactory.getInstance().closeDriver();

    }
}
