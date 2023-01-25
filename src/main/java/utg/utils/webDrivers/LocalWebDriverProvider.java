package utg.utils.webDrivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;

public class LocalWebDriverProvider implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }
}
