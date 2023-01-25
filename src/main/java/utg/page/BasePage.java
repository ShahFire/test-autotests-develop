package utg.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public abstract class BasePage {
    protected SelenideElement container = $x("//main");
    private SelenideElement header = $x("//header");

    public void checkDisplayOfElements() {
    }

    public abstract void checkTitle();
}
