package utg.elements.basic;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Textarea extends BaseElement{
    public Textarea(SelenideElement container) {
        super(container);
    }
    public Textarea(String id) {
        super($(By.xpath("//textarea[@id='" + id + "']")));
    }
    public void set(String value){
        container.setValue(value);
    }
}
