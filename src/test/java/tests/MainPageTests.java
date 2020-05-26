package tests;

import org.testng.annotations.Test;
import pages.AccountPage;
import pages.ProductPage;
import utils.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class MainPageTests extends TestBase {

    @Test(priority = 1)
    public void userCanLoginAndLogout() {
        AccountPage accountPage = getShopMainPage().clickOnLoginForm().loginToAccount();
        accountPage.getLoginPageTitleElem().shouldHave(text("Mani dati"));
        accountPage.logOut()
                .getLoginButton().shouldBe(visible);
    }


    @Test(priority = 2)
    public void userCanChooseProductFromRecommendedAndAddToCart() {
        ProductPage product = getShopMainPage()
                .clickOnRecommendedProducts()
                .choseProduct(20);

        String productName = product.getProductName();
        product.addProductToCartAndBuy()
                .getFirstAddedProduct().shouldHave(text(productName));
    }
}
