package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginFormPage {
    private static final String USER_NAME = "myprivatetests2020@gmail.com";
    private static final String PASSWORD = "testingtesting";
    private static final String loginFormLocator = "#loginModal ";

    public void loginToAccount(){
        $(loginFormLocator + "input[type='email']").sendKeys(USER_NAME);
        $(loginFormLocator + "input[type='password']").sendKeys(PASSWORD);
        $(loginFormLocator + "input[type='submit']").click();
        $(".page-title").shouldHave(text("Mani dati"));
    }
}
