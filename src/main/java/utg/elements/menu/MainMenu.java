package utg.elements.menu;

import utg.elements.basic.Div;
import utg.elements.basic.Span;

import static com.codeborne.selenide.Selenide.$x;

public class MainMenu {
    public void openMenuItem(int indexCategories, String elementName){
        Div category = new Div($x("//div[@class='element-group'][" + Integer.toString(indexCategories) + "]"));
        Span element = new Span($x("//div[@class='element-group']/div/ul/li/span[contains(text(), '" + elementName + "')]"));
        if (!element.isDisplayed()){
            category.click();
        }
        element.click();
    }
}
