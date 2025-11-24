import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
    void fillFormTest() {
    open("https://demoqa.com/text-box");

    $(By.cssSelector("#userName")).setValue("Alexandr Yakovlev");
    $(By.cssSelector("#userEmail")).setValue("a.yakovlev@aqsi.ru");
    $(By.cssSelector("#currentAddress")).setValue("ggg");
    $(By.cssSelector("#permanentAddress")).setValue("666");

    $(By.cssSelector("#output")).shouldHave(text("Alexandr Yakovlev"), text("a.yakovlev@aqsi.ru"), text("ggg"),  text("666"));

    $(By.cssSelector("#userName")).clear();
    }
}
