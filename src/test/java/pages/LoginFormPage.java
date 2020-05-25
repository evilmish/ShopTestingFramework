package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginFormPage {
    private static final String USER_NAME = "myprivatetests2020@gmail.com";
    private static final String PASSWORD = "testingtesting";
    private static final String loginFormLocator = "#loginModal ";

    public AccountPage loginToAccount(){
        $(loginFormLocator + "input[type='email']").sendKeys(USER_NAME);
        $(loginFormLocator + "input[type='password']").sendKeys(PASSWORD);
        $(loginFormLocator + "input[type='submit']").click();
        return page(AccountPage.class);
    }

}
