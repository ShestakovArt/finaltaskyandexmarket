package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.DriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver = DriverManager.getDriver();

    @Before
    public void startScenario() {
        driver.get("https://yandex.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @After
    public static void afterMethod() {
        driver.quit();
    }
}
