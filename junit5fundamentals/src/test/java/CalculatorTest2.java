import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest2 {
    @Test
    @DisplayName("Test adding two positive numbers")
    void add() {
        Calculator c = new Calculator();
        int numberFirst = 18;
        int numberSecond = 35;
        int expectedResult = 53;
        int actualResult =  c.add(numberFirst, numberSecond);
        assertEquals(expectedResult, actualResult, "Adding two positive numbers not correct");
    }


    @ParameterizedTest
    @CsvFileSource(resources = "adding.csv")
    void addCompleteTest(int a, int b, int expected) {
        Calculator c = new Calculator();
        int actual = c.add( a, b);
        assertEquals(expected, actual, "adding not correct");
    }
}





