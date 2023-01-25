package tests.elementsTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;
import utg.elements.menu.MainMenu;
import utg.page.pages.MainPage;
import utg.page.pages.elementsPages.TextBoxPage;

@Feature("Elements")
public class Test1 extends BaseTest {
    MainPage mainPage = new MainPage();
    MainMenu mainMenu = new MainMenu();
    TextBoxPage textBoxPage = new TextBoxPage();

    @BeforeClass (description = "Вход на страницу")
    public void beforeClass() {
        mainPage.elementsCard.click();
        mainMenu.openMenuItem(1, "Text Box");
    }
    @Test
    public void test() {
        step1();
        step2();
    }
    @Step ("1. Заполнить все поля данными")
    public void step1(){
        textBoxPage.userName.set("Шодиев Артур");
        textBoxPage.userEmail.set("shah-fire@mail.ru");
        textBoxPage.currentAddress.set("Комтрома, Ленина 147, 29");
        textBoxPage.permanentAddress.set("Шарья, Калинина 14");
    }
    @Step("2. Нажать на клавишу Submit")
    public void step2(){
        textBoxPage.submitBtn.click();
    }
}
