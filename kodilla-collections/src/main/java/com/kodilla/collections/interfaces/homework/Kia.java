package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Kia implements Car{
    private int speed;
    public Kia(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Kia{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public int increaseSpeed() {

        return speed += 12;
    }

    @Override
    public int decreaseSpeed() {
        return speed -= 11;
    }
}
