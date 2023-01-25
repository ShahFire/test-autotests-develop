package utg.elements.basic;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button extends BaseElement{
    public Button(SelenideElement container) {
        super(container);
    }
    public Button(String id) {
        super($(By.xpath("//button[@id='" + id + "']")));
    }
}
