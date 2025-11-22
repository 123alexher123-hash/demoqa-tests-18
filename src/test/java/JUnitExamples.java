import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Here is beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Here is beforeEach");
    }

    @Test
    void firstTest() {
        System.out.println("Here is firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("Here is secondTest()");
    }
}
