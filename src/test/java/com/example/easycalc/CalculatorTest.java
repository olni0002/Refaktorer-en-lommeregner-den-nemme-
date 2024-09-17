package com.example.easycalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void onePlusTwoShouldEqual3() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first, second);
        assertEquals(3.0, result, 0.1);
    }

    @Test
    void oneMinusTwoShouldEqualMinusOne() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first, second);
        assertEquals(-1.0, result, 0.1);
    }

    @Test
    void oneTimesTwoShouldEqualTwo() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first, second);
        assertEquals(2.0, result, 0.1);
    }

    @Test
    void oneDividedByTwoShouldEqualPointFive() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first, second);
        assertEquals(0.5, result, 0.1);
    }
}
