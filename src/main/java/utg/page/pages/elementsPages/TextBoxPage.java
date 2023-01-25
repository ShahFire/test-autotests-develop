package utg.page.pages.elementsPages;

import utg.elements.basic.Button;
import utg.elements.basic.Input;
import utg.elements.basic.Textarea;

public class TextBoxPage {
    public Input userName = new Input("userName");
    public Input userEmail = new Input("userEmail");
    public Textarea currentAddress = new Textarea("currentAddress");
    public Textarea permanentAddress = new Textarea("permanentAddress");
    public Button submitBtn = new Button("submit");
}
