package steps;

import io.cucumber.java.ru.Когда;
import pages.MarketMainPage;

public class MarketMainStep {

    @Когда("выбран пункт каталога {string}")
    public void selectCatalogItem(String catalogItem){
        new MarketMainPage().selectMainMenu(catalogItem);
    }
}
