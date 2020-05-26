package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.remote.DesiredCapabilities;
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
        Configuration.startMaximized = true;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        this.shopMainPage = open(baseUrl, MainPage.class);
    }

    @AfterMethod
    public void goBackToInitialPage() {
        open(baseUrl);
    }

}
