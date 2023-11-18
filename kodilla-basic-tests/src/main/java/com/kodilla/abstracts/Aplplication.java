package com.kodilla.abstracts;

public class Aplplication {
    public static void main(String[] args) {
        Animal dog = new Dog(4);

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
