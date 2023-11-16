package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public  void turnOn() {
        System.out.println("Windows is starting");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows turns off");
    }
}
