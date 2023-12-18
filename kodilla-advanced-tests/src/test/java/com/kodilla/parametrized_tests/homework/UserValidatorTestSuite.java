package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"user_1", "user.2", "User-3", "user", "user.name", "User-Name"})
    public void shouldValidateUsername(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"us", "4", "", " ", "a", "A","User-4!", "user@name"})
    public void shouldNotValidateUsername(String username) {
        assertFalse(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"email@example.com", "firstname.lastname@example.com", "email@subdomain.example.com"})
    public void shouldValidateEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = { "emailexample", "@test.com", "<outlookuser@example.com>", " ", "test@email..com", "firstname+lastname@exaample.com"})
    public void shouldNotValidateEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }
}
