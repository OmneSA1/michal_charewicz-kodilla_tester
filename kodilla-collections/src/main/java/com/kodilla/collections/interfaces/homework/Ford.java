package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car{
    private int speed;
    public Ford(int speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed += 14;
    }

    @Override
    public int decreaseSpeed() {
        return  speed -= 10;
    }
}
