package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketMainPage extends BasePage{

    @FindBy (xpath = "//div[@data-apiary-widget-id = '/menu/layout/layout']")
    WebElement marketMainMenu;

    public void selectMainMenu (String services){
        marketMainMenu.findElement(By.xpath(".//span[contains(text(), '" + services + "')]/..")).click();
    }
}
