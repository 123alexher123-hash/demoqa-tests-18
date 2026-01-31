import Pages.DataEntryPage;
import Pages.ModalPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class PracticeForPage extends TestBase {

    DataEntryPage dataEntryPage = new DataEntryPage();
    ModalPage modalPage = new ModalPage();

    @Test
    void dataEntryPositive() {
        dataEntryPage
                .openPractieForm()
                .entryName("Александр", "Яковлев")
                .entryEmail("moi@yaica.com")
                .choiceGender()
                .entryPhoneNumber("8999978397")
                .openDateOfBirth()
                .entryDateOfBirth("August", "1998", "8")
                .entrySubjects("Maths")
                .choiceHobbies()
                .uploadPicture()
                .entryAddress("г. Москва, ул. Пушкина, д. Колотушкина")
                .choiceState("NCR")
                .choiceCity("Noida")
                .clickSubmitBtn();
        modalPage
                .verifyOpenModal("Thanks for submitting the form")
                .dataVerification("Student Name", "Александр Яковлев")
                .dataVerification("Student Email", "moi@yaica.com")
                .dataVerification("Gender", "Male")
                .dataVerification("Mobile", "8999978397")
                .dataVerification("Date of Birth", "08 August,1998")
                .dataVerification("Subjects", "Maths")
                .dataVerification("Hobbies", "Reading")
                .dataVerification("Picture", "negrilla.jpg")
                .dataVerification("Address", "г. Москва, ул. Пушкина, д. Колотушкина")
                .dataVerification("State and City", "NCR Noida");

        sleep(2000);
    }
}
