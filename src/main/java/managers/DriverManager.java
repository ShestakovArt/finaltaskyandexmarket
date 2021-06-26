package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class DriverManager {

    private static WebDriver driver;
    private static Properties properties = TestProperties.getInstance().getProperties();

    private DriverManager(){

    }

    public static WebDriver getDriver(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        }
        return driver;
    }
}
