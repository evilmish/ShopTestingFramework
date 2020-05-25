package tests;

import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CartPage;
import pages.ProductPage;
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
        ProductPage product = getShopMainPage()
                .clickOnRecommendedProducts()
                .choseProduct(20);

        String productName = product.getProductName();
        product.addProductToCart()
                .getFirstAddedProduct().shouldHave(text(productName));
    }
}
