package utg.page.pages;

import utg.elements.basic.Div;
import utg.page.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {

    public Div elementsCard = new Div($x("//div[@class='card mt-4 top-card'][1]"));
    public Div formsCard = new Div($x("//div[@class='card mt-4 top-card'][2]"));
    public Div alertsCard = new Div($x("//div[@class='card mt-4 top-card'][3]"));
    public Div widgetsCard = new Div($x("//div[@class='card mt-4 top-card'][4]"));
    public Div interactionsCard = new Div($x("//div[@class='card mt-4 top-card'][5]"));
    public Div bookStoreCard = new Div($x("//div[@class='card mt-4 top-card'][6]"));

    @Override
    public void checkTitle() {

    }
}
