package pages;

import managers.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private static String tittleNameItem;

    public static String getTittleNameItem() {
        return tittleNameItem;
    }

    public void setTittleNameItem(String tittleNameItem) {
        this.tittleNameItem = tittleNameItem;
    }

    protected WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,30);

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public BasePage(){
        PageFactory.initElements(driver, this);
    }


}
