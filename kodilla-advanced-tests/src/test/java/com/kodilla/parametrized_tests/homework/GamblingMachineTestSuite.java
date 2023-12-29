package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTestData.csv", numLinesToSkip = 1)
    public void shouldTestGamblingMachine(String input, boolean expectedValid) {
        Set<Integer> userNumbers = Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        GamblingMachine machine = new GamblingMachine();

        if (expectedValid) {
            Assertions.assertDoesNotThrow(() -> machine.howManyWins(userNumbers));
        } else {
            Assertions.assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
        }
    }
}
