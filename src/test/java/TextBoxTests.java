import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {


    @Test
    void fillFormTest() {

    open("https://demoqa.com/text-box");

    $("#userName").setValue("Alex");
    $("#userEmail").setValue("a.yakovlev@aqsi.ru");
    $("#currentAddress").setValue("first");
    $("#permanentAddress").setValue("second");

    $("#submit").scrollIntoView(true);

    $("#submit").click();

    $("#output").scrollIntoView(true);

    $("#name").shouldHave(text("Alex"));
    $("#email").shouldHave(text("a.yakovlev@aqsi.ru"));
    $("#output").$("#currentAddress").shouldHave(text("first"));
    $("#output").$("#permanentAddress").shouldHave(text("second"));
            }
}
