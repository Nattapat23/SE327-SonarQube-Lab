package se327;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedCalculatorTest {
    @Test
    public void testPower() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(8.0,calculator.power(2,3),0.01);
    }
    @Test
    public void testSqrt() throws IllegalAccessException {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(2.0, calculator.sqrt(4),0.01);
    }

}
