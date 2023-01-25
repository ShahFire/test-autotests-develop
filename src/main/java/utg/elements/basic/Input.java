package utg.elements.basic;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Input extends BaseElement{
    public Input(SelenideElement container) {
        super(container);
    }
    public Input(String id) {
        super($(By.xpath("//input[@id='" + id + "']")));
    }
    public void set(String value){
        container.setValue(value);
    }
}
