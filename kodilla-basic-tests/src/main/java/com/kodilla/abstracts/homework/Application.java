package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(4);
        System.out.println("Square area: " + square.surfaceAreaCalculation() );
        System.out.println("Square circuit: " + square.circuitCalculation());

        Shape rectangle = new Rectangle(5,8);
        System.out.println("Rectangle area: " + rectangle.surfaceAreaCalculation());
        System.out.println("Rectangle circuit: " + rectangle.circuitCalculation());;

        Shape triangle = new Triangle(5,8,14);

        System.out.println("Traingle area: " + triangle.surfaceAreaCalculation());
        System.out.println("Triangle circuit: " + triangle.circuitCalculation() );
    }
}
