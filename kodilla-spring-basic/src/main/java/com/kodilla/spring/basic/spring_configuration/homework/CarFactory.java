package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.ZonedDateTime;
import java.time.Month;

@Configuration
public class CarFactory {

    @Bean
    public Car createCar() {
        ZonedDateTime now = ZonedDateTime.now();
        Month month = now.getMonth();

        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY:
                return new SUV();
            case MARCH, APRIL, MAY, JUNE, JULY, AUGUST:
                return new Cabrio();
            default:
                return new Sedan();
        }
    }
}