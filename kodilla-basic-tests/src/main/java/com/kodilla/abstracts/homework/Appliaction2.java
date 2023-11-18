package com.kodilla.abstracts.homework;

public class Appliaction2 {
    public static void main(String[] args) {
        Person firefighter = new Person("Maciej", 28, new Firefighter());
        firefighter.displayJobResponsibilities();

        Person busDriver = new Person("Robert", 37, new BusDriver());
        busDriver.displayJobResponsibilities();
    }
}
