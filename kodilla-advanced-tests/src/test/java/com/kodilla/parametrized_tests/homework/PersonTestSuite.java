package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.BMIDataSources#provideDataForBMICalculation")
    public void shouldCalculateBMICorrectly(double height, double weight, String expectedCategory) {
        Person person = new Person(height, weight);
        assertEquals(expectedCategory, person.getBMI());
    }
}