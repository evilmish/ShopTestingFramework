package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement getFirstAddedProduct(){
        return $(".product-name a");
    }
}
