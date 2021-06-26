package steps;

import io.cucumber.java.ru.Когда;
import org.junit.Assert;
import pages.BasePage;
import pages.FirstItemPage;

public class FirstItemStep {

    @Когда("получили название товара и сравнить")
    public void getTittleItem(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Найден не тот товар", BasePage.getTittleNameItem(),new FirstItemPage().getTittleName());
    }
}
