package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public int surfaceAreaCalculation() {
        return sideA * sideB / 2;
    }

    @Override
    public int circuitCalculation() {
        return sideA + sideB + sideC;
    }
}
