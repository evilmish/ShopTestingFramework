package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    public SelenideElement getLoginPageTitleElem(){
        return $(".page-title");
    }
}
