package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;
public class BaseTest {
    private String urlSite = "https://demoqa.com";

    @BeforeClass(description = "Инициализация", alwaysRun = true)
    public void testInit() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.baseUrl = urlSite;
        open("/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterClass(description= "Закрытие браузера и очищение Cookies")
    public void afterClass() {
        WebDriverRunner.driver().clearCookies();
        WebDriverRunner.driver().close();
    }
}
