package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {
@Autowired
private Calculator calculator;
    @Test
    void shouldAddTwoNumbers() {
        double result = calculator.add(5,3);
        assertEquals(8,result,0.001);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        double result = calculator.subtract(7,2);
        assertEquals(5,result,0.001);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        double result = calculator.multiply(8,9);
        assertEquals(72,result,0.001);
    }

    @Test
    void shouldDivideTwoNumbers() {
        double result = calculator.divide(8,4);
        assertEquals(2,result,0.001);
    }
}