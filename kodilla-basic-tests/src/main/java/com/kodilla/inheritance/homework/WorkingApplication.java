package com.kodilla.inheritance.homework;

public class WorkingApplication {
    public static void main(String[] args) {
        Windows windows = new Windows(2022);
        windows.turnOn();
        windows.turnOff();

        MacOs macOs = new MacOs(2023);
        macOs.turnOn();
        macOs.turnOff();

    }
}
