package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSquarePositive() {
        Calculator calculator = new Calculator();
        int a = 3;
        double squareResult = calculator.square(a);
        assertEquals(9.0, squareResult, 0.01);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        double squareResult = calculator.square(a);
        assertEquals(0.0, squareResult, 0.01);
    }

    @Test
    public void testSquareNegative() {
        Calculator calculator = new Calculator();
        int a = -3;
        double squareResult = calculator.square(a);
        assertEquals(9.0, squareResult, 0.01);
    }

}
