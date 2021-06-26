package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstItemPage extends BasePage{

    @FindBy(xpath = "//h1")
    WebElement tittleName;

    public String getTittleName(){
        return tittleName.getText();
    }
}
