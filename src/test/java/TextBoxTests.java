import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {


    @Test
    void fillFormTest() {

    open("https://demoqa.com/text-box");

    $("#userName").setValue("Alexandr Yakovlev");
    $("#userEmail").setValue("a.yakovlev@aqsi.ru");
    $("#currentAddress").setValue("first");
    $("#permanentAddress").setValue("second");

    $("#submit").scrollIntoView(true);

    $("#submit").click();

    $("#output").scrollIntoView(true);

    $("#name").shouldHave(text("Alexandr Yakovlev"));
    $("#email").shouldHave(text("a.yakovlev@aqsi.ru"));
    $("#output").$("#currentAddress").shouldHave(text("first"));
    $("#output").$("#permanentAddress").shouldHave(text("second"));
    //$("#permanentAddress").shouldHave(text("second"));
            }
}
