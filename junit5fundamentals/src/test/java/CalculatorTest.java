import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Test multiplying two numbers")
    void add() {
        Calculator c = new Calculator();
        int numberFirst = 2;
        int numberSecond = 3;
        int expectedResult = 6;
        int actualResult =  c.multiply(numberFirst, numberSecond);
        assertEquals(expectedResult, actualResult, "multiplying two numbers not correct");
    }
}





