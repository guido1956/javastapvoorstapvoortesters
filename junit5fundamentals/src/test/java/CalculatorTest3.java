import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest3 {
    Calculator c;

    @BeforeEach
     void init() {
         c = new Calculator();
    }

    @AfterEach()
     void close() {
        c = null;
    }

    @Test
    @DisplayName("Test multiplying two numbers")
    void multiply() {

        int numberFirst = 2;
        int numberSecond = 3;
        int expectedResult = 6;
        int actualResult =  c.multiply(numberFirst, numberSecond);
        assertEquals(expectedResult, actualResult, "multiplying two numbers not correct");
    }

    @Test
    @DisplayName("Test adding two positive numbers")
    void add() {

        int numberFirst = 2;
        int numberSecond = 3;
        int expectedResult = 5;
        int actualResult =  c.add(numberFirst, numberSecond);
        assertEquals(expectedResult, actualResult, "adding two positive numbers not correct");
    }


    @Test
    @DisplayName("Test max of two numbers. First number is bigger")
    void bigger() {

        int numberFirst = 2;
        int numberSecond = 3;
        boolean expectedResult = false;
        boolean actualResult =  c.bigger(numberFirst, numberSecond);
        assertEquals(expectedResult, actualResult, "multiplying two numbers not correct");
    }


}
