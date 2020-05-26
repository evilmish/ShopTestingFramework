package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;


public class RecommendedProductsPage {


    private ElementsCollection getAllListedItemsOnPage() {
        return $$("[class^='product-list-item']");
    }

    public ProductPage choseProduct(int elementId) {
        SelenideElement elem = getAllListedItemsOnPage().get(elementId).hover();
        elem.find("[class='image-wrap']").click();
        return page(ProductPage.class);
    }

    private ElementsCollection getAllAvailablePages() {
        return $$("[widget-attachpoint^=pageSlot]");
    }
}
