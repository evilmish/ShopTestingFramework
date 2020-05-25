package tests;

import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CartPage;
import pages.ProductPage;
import pages.RecommendedProductsPage;
import utils.TestBase;

import static com.codeborne.selenide.Condition.text;

public class MainPageTests extends TestBase {

    @Test
    public void userCanLoginByUsernameAndPassword() {
        AccountPage accountPage = getShopMainPage().clickOnLoginForm().loginToAccount();
        accountPage.getLoginPageTitleElem().shouldHave(text("Mani dati"));
    }

    @Test
    public void userCanChooseProductFromRecommendedAndAddToCart() {
        RecommendedProductsPage recommendedProductsPage = getShopMainPage().clickOnRecommendedProducts();
        ProductPage firstProductPage = recommendedProductsPage.clickOnChosenProduct(20);
        String productName = firstProductPage.getProductName();
        CartPage cartPage = firstProductPage.addProductToCart();
        cartPage.getFirstAddedProduct().shouldHave(text(productName));
    }
}
