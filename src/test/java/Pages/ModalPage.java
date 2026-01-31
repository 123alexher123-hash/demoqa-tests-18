package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ModalPage {

    public ModalPage verifyOpenModal(String value){
        $(".modal-content").shouldHave(text(value));
        return this;
    }

    public ModalPage dataVerification(String key, String value) {
        $(".table-bordered").$(byText(key))
                .sibling(0)
                .shouldHave(text(value));
        return this;
    }

}
