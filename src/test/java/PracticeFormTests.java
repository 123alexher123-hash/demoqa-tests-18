import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    @Test
    void fillPracticeFormTest()
    {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Yakovlev");
        $("#userEmail").setValue("a.yakovlev@aqsi.ru");

        $("label[for='gender-radio-1']").scrollIntoView(true);
        $("label[for='gender-radio-1']").click();

        $("#userNumber").setValue("79186846355");

        $("#dateOfBirthInput").click();

        $(".react-datepicker__year-select").selectOption("1998");
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__day--008:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsContainer").scrollIntoView(true);
        $("#subjectsInput").setValue("Maths").pressEnter();

        $("label[for='hobbies-checkbox-1']").click();

        $("#uploadPicture").uploadFromClasspath("morning.jpg");

        $("#currentAddress").setValue("currentAddress");

        $("#state").click();

        $("#city").click();



    }
}
