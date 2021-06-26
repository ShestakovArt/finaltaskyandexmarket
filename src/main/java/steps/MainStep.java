package steps;

import io.cucumber.java.ru.Когда;
import pages.BasePage;
import pages.MainPage;

public class MainStep {

    @Когда("когда выбран сервис {string}")
    public void selectServiceMenu (String serviceMenu){
        new MainPage().selectServices(serviceMenu);
    }

    @Когда("переключились на новую вкладку")
    public void switchNewTab(){
        new MainPage().switchToNewTab();
    }
}
