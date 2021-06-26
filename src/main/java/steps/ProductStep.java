package steps;

import io.cucumber.java.ru.Когда;
import pages.BasePage;
import pages.ProductPage;

public class ProductStep {

    @Когда("в панели фильтра установлено значение в поле \"Цена от\": {string}")
    public void selectPriceFrom(String price){
        new ProductPage().priceFrom(price);
    }

    @Когда("выбран производитель {string}")
    public void selectFilterManufacturer(String manufacturer){
        new ProductPage().selectManufacturer(manufacturer);
    }

    @Когда("выбрано количество отображаемых элементов на странице {int}")
    public void showItem(int item){
        new ProductPage().selectShowItems(item);
    }

    @Когда("проверили, что количество отображаемых элементов на странице совпадает")
    public void checkShowItem(){
        new ProductPage().checkShowItems();
    }

//    @Когда("получили название первого найденного товара")
//    public String getNameFirstItem(){
//        String searchItem = new ProductPage().getNameFirstItem();
//        return searchItem;
//    }

    @Когда("получили название первого найденного товара и заполнили поисковую строку значением")
    public void fillSearch(){
        new ProductPage().getNameFirstItem();
        new ProductPage().fillingSearchBar(BasePage.getTittleNameItem());
    }

    @Когда("нажимаем кнопку \"Найти\"")
    public void clickButtonSearch(){
        new ProductPage().clickButtonSearch();
    }

    @Когда("провалились в первый найденный результат")
    public void clickFirstItem(){
        new ProductPage().clickFirstItem();
    }

    @Когда("переключились на новую вкладку результата поиска")
    public void switchNewTab(){
        new ProductPage().switchToNewTab();
    }
}
