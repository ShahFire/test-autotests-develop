package utg.page.pages.elementsPages;

import org.openqa.selenium.By;
import utg.elements.basic.Button;
import utg.elements.basic.Span;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
//    public Button expandAllBtn = new Button("Expand all", "title");
//    public Button collapseAllBtn = new Button("Collapse all", "title");
    public Span notesSpan = new Span($(By.xpath("//span[contains(text(),'Notes')]"));
    public Span reactSpan = new Span($(By.xpath("//span[contains(text(),'React')]"));
    public Span privateSpan = new Span($(By.xpath("//span[contains(text(),'Private')]"));
    public Span excelFileSpan = new Span($(By.xpath("//span[contains(text(),'Excel File.doc')]"));
}
