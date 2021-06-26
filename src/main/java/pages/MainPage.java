package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class MainPage extends BasePage{

    @FindBy ( xpath = "//*[@aria-label = 'Сервисы']//ul")
    WebElement servicesMenu;

    public void selectServices (String services) {
        servicesMenu.findElement(By.xpath(".//div[contains(text(), '" + services + "')]/..")).click();
    }

    public void switchToNewTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
    }
}
