package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMIDataSources {

    static Stream<Arguments> provideDataForBMICalculation() {
        return Stream.of(
                Arguments.of(1.80, 50.0, "Severely underweight"), // Poprawka: "Severely underweight"
                Arguments.of(1.75, 80.0, "Overweight"),          // Bez zmian, jeśli BMI pasuje
                Arguments.of(1.60, 45.0, "Underweight")          // Poprawka, jeśli BMI pasuje
        );
    }
}
