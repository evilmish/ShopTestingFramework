package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    @Getter
    private MainPage shopMainPage;

    @BeforeMethod
    public void openInitialShopPage() {
        String chromeVersion = System.getProperty("chrome.driver.version", "");
        if (!chromeVersion.isEmpty()) {
            WebDriverManager.chromedriver().version(chromeVersion);
        }
        Configuration.startMaximized = true;
        this.shopMainPage = open("https://220.lv", MainPage.class);
    }

    @BeforeMethod
    public void goBackToInitialPage() {
        closeWebDriver();
    }

}
