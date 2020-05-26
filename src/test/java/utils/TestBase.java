package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    private String baseUrl = "https://220.lv";

    @Getter
    private MainPage shopMainPage;

    @BeforeClass
    public void openInitialShopPage() {
        String chromeVersion = System.getProperty("chrome.driver.version", "");
        if (!chromeVersion.isEmpty()) {
            WebDriverManager.chromedriver().version(chromeVersion);
        }
        Configuration.startMaximized = true;
        this.shopMainPage = open(baseUrl, MainPage.class);
    }

    @AfterMethod
    public void goBackToInitialPage() {
        open(baseUrl);
    }

}
