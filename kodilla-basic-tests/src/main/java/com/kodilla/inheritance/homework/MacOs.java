package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {
    public MacOs(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOff() {
        System.out.println("Mac OS turns off");
    }

    @Override
    public void turnOn() {
        System.out.println("Mac OS turns on");
    }
}
