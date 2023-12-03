package com.kodilla.collections.adv.immutable.homework;

public class App {
    public static void main(String[] args) {
        Task task = new Task("Nauka Javy", 120);
        System.out.println("Task: " + task.title() + ", Duration: " + task.duration());
    }
}
