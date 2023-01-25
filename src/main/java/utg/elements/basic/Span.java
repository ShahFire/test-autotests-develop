package utg.elements.basic;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Span extends BaseElement{
    public Span(SelenideElement container) {
        super(container);
    }
    public Span(String id) {
        super($(By.xpath("//span[@id='" + id + "']")));
    }
}
