package com.kodilla.spring.basic.spring_scope.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class Clock {
    private final LocalDateTime time;
    public Clock() {
        this.time = LocalDateTime.now();
        System.out.println("Utwórz nowy zegar: " + time);
    }
    public LocalDateTime getTime() {
        return time;
    }
}
