package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if(car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown Car name";
    }
    private static Car drawCar(){
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int a = getRandomSpeed(random);
        if(drawnCar == 0)
            return new Ford(a);
        else if (drawnCar == 1)
            return new Kia(a);
        else
            return new Opel(a);
    }

    private static int getRandomSpeed(Random random) {

        return random.nextInt(180) +1;
    }
}
