import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;

public class TestBase {
    @BeforeAll
    static void setup(){
        baseUrl = "https://demoqa.com/automation-practice-form";
        browserSize = "1920x1080";
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}

