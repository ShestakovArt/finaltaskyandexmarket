package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(name = "Цена от")
    WebElement priceFrom;

    @FindBy(xpath = "//*[@data-autotest-id = '7893318']")
    WebElement manufacturer;

    @FindBy(xpath = "//span[contains(text(), 'Показывать по')]")
    WebElement showItems;

    @FindBy(xpath = "//button[contains(@id, 'dropdown-control')]")
    WebElement buttonItem;

    @FindBy(xpath = "//*[@data-autotest-id = 'product-snippet']")
    List<WebElement> productSnippet;

    @FindBy(xpath = "//div[contains(@data-apiary-widget-id, 'results')]//article[1]//h3//a")
    WebElement firstSearchItem;

    @FindBy(name = "text")
    WebElement searchBar;

    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement buttonSearch;

    public void priceFrom(String price) {
        fillField(priceFrom, price);
    }

    public void selectManufacturer(String company) {
        WebElement element = manufacturer.findElement(By.xpath(".//input[contains(@name, 'Производитель " + company + "')]/.."));
        scrollToElement(element);
        element.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectShowItems(int quantity) {
        if (quantity < 13) quantity = 12;
        else quantity = 48;
        if (productSnippet.size() == 48 || productSnippet.size() == 12) {
            scrollToElement(showItems);
            String countItem = showItems.getText();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!countItem.contains(String.valueOf(quantity))) {
                buttonItem.click();
                driver.findElement(By.xpath("//button[contains(text(), 'Показывать по " + quantity + "')]")).click();
            }
        }
    }

    public void checkShowItems() {
        if (productSnippet.size() == 48 || productSnippet.size() == 12) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Assert.assertEquals("Количество элементов не совпадает", showItems.getText().substring(14), String.valueOf(productSnippet.size()));
        }
    }

    public void fillingSearchBar(String value) {
        scrollToElement(searchBar);
        fillField(searchBar, value);
    }

    public void clickButtonSearch() {
        buttonSearch.click();
    }

    public void clickFirstItem() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        firstSearchItem.click();
    }

    public void switchToNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
    }

    public void getNameFirstItem() {
        new BasePage().setTittleNameItem(productSnippet.get(0).findElement(By.xpath(".//h3[@data-zone-name = 'title']//span")).getText());
    }
}
