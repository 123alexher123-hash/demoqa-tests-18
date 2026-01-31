package Pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DataEntryPage {

    public DataEntryPage openPractieForm(){
        open(baseUrl);
        $(".practice-form-wrapper").shouldBe(visible);
        return this;
    }

    public DataEntryPage entryName(String valueFirstName, String valueLastName){
        $("[placeholder='First Name']").setValue(valueFirstName);
        $("[placeholder='Last Name']").setValue(valueLastName);
        return this;
    }

    public DataEntryPage entryEmail(String value) {
        $("[placeholder='name@example.com']").setValue(value);
        return this;
    }

    public DataEntryPage choiceGender(){
        $("label[for='gender-radio-1']").click();
        return this;
    }

    public DataEntryPage entryPhoneNumber(String value){
        $("[placeholder='Mobile Number']").setValue(value);
        return this;
    }

    public DataEntryPage openDateOfBirth(){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-container").shouldBe(visible);
        return this;
    }

    public DataEntryPage entryDateOfBirth(String month, String year, String date){
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--00" + date + ":not(react-datepicker__day--outside-month)").click();
        return this;
    }

    public DataEntryPage entrySubjects(String value){
        $(".subjects-auto-complete__input").$("input")
                .setValue(value)
                .pressEnter();
        return this;
    }

    public DataEntryPage choiceHobbies(){
        $("label[for='hobbies-checkbox-2']").click();
        return this;
    }

    public DataEntryPage uploadPicture(){
        $(".form-control-file").uploadFromClasspath("negrilla.jpg");
        return this;
    }

    public DataEntryPage entryAddress(String value){
        $("[placeholder='Current Address']").setValue(value);
        return this;
    }

    public DataEntryPage choiceState(String value){
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public DataEntryPage choiceCity(String value){
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public DataEntryPage clickSubmitBtn(){
        $(".btn-primary").click();
        return this;
    }

}
