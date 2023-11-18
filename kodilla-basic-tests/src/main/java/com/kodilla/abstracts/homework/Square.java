package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }
    @Override
    public int surfaceAreaCalculation() {
        return side * side;
    }

    @Override
    public int circuitCalculation() {
        return 4 * side ;
    }
}
