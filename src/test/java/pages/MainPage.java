package pages;

import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    public LoginFormPage clickOnLoginForm(){
        $("[class^='visitor-login']").click();
        return new LoginFormPage();
    }
}
