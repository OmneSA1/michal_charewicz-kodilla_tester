package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private int sideA;
    private int sideB;
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int surfaceAreaCalculation() {
        return sideA * sideB;
    }

    @Override
    public int circuitCalculation() {
        return 2 * sideA + 2 * sideB;
    }
}
