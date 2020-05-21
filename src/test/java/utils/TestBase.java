package utils;

import lombok.Getter;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    @Getter
    private MainPage shopMainPage;

    @BeforeMethod
    public void openInitialShopPage() {
        this.shopMainPage = open("https://220.lv", MainPage.class);
    }

}
