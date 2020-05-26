package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AccountPage {

    public SelenideElement getLoginPageTitleElem() {
        return $(".page-title");
    }

    public LoginFormPage logOut() {
        $("[class^='visitor-login']").hover()
                .$("li:last-of-type").click();
        return page(LoginFormPage.class);
    }
}
