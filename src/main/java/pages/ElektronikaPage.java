package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElektronikaPage extends BasePage{

//    @FindBy(xpath = "//ul[@data-autotest-id = 'subItems']")
//    WebElement catalogMenu;

    public void selectCatalogMenu (String catalogItem) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[text() = '" + catalogItem + "']/..")).click();
    }

    public void scrollCatalogBlock (String catalogBlock){
        scrollToElement(driver.findElement(By.xpath("//a[contains(text(), '" + catalogBlock + "')]/../..")));
    }

//    @FindBy(xpath = "//h3[contains(text(), 'Покупайте электронику на Маркете')]/../../..")
//    WebElement catalogMenu;
//
//    public void selectCatalogMenu (String services) {
//        catalogMenu.findElement(By.xpath(".//div[contains(text(), '" + services + "')]/../../..")).click();
//    }
}
