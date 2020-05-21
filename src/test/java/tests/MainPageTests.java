package tests;

import org.testng.annotations.Test;
import utils.TestBase;

public class MainPageTests extends TestBase {

    @Test
    public void userCanLoginByUsernameAndPassword() {
        getShopMainPage().clickOnLoginForm().loginToAccount();
    }
}
