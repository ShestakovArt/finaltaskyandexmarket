package steps;

import io.cucumber.java.ru.Когда;
import managers.DriverManager;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.ElektronikaPage;

public class ElektronikaStep {

    @Когда("переходим к блоку каталога {string}")
    public void selectCatalogBlock (String catalogBlock){
        new ElektronikaPage().scrollCatalogBlock(catalogBlock);
    }

    @Когда("выбран подпункт каталога {string}")
    public void selectSubCatalogItem (String subCatalogItem){
        new ElektronikaPage().selectCatalogMenu(subCatalogItem);
    }
}
