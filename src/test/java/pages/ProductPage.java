package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ProductPage {

    public String getProductName() {
        return $(By.tagName("h1")).text();
    }

    public CartPage addProductToCartAndBuy() {
        $("[widget-attachpoint='addToCart']").scrollIntoView(false).click();
        $("#buy").click();
        return page(CartPage.class);
    }
}
