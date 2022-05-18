import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTestShowDisplay {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeEach
    public void setStream() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreInitialStream() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Test output results multiply on console with showDisplayCalculation")
    void testdisplay() {
        Calculator c = new Calculator();
        int a = 12;
        int b = 2;
        String expectedResult = "12 * 2 = 24";
        c.multiply(a,b);  // returnwaarde is niet belangrijk
        c.showDisplayCalculation();
        assertEquals(expectedResult.trim(), out.toString().trim() );
    }
}

