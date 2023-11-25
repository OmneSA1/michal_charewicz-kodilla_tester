package com.kodilla.collections.interfaces.homework;

public class Kia implements Car{
    private int speed;
    public Kia(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
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
