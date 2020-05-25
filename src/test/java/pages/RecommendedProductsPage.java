package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;
import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;


public class RecommendedProductsPage {


    private ElementsCollection getAllListedItemsOnPage(){
        return $$("[class^='product-list-item']");
    }

    public ProductPage clickOnChosenProduct(int elementId){
        SelenideElement elem = getAllListedItemsOnPage().get(elementId).hover();
        elem.find("[class='image-wrap']").click();
        return page(ProductPage.class);
    }

    private ElementsCollection getAllAvailablePages(){
        return  $$("[widget-attachpoint^=pageSlot]");
    }
}
