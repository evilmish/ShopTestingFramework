package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class MainPage {

    public LoginFormPage clickOnLoginForm() {
        $("[class^='visitor-login']").click();
        return page(LoginFormPage.class);
    }

    public RecommendedProductsPage clickOnRecommendedProducts() {
        $("#homePageRecommender svg").scrollIntoView(false).click();
        return page(RecommendedProductsPage.class);
    }
}
