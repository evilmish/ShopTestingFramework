package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;


public class MainPage {

    public LoginFormPage clickOnLoginForm(){
        $("[class^='visitor-login']").click();
        return page(LoginFormPage.class);
    }

    public RecommendedProductsPage clickOnRecommendedProducts(){
        $("[widget-attachpoint='header'] svg").scrollIntoView(false).click();
        return page(RecommendedProductsPage.class);
    }
}
