package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CarFactoryTestSuite {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testSUVCreation() {

        Car car = context.getBean("createCar", Car.class);
        assertTrue(car instanceof SUV);
    }
}