package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100);
        Kia kia = new Kia(100);
        Opel opel = new Opel(100);
        doRace(ford);
        doRace(kia);
        doRace(opel);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Aktualna prędkość: " + car.getSpeed());
    }
}
