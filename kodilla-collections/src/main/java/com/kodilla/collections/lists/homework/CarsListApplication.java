package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Kia kia = new Kia(133);
        cars.add(kia);
        cars.add(new Ford(140));
        cars.add(new Kia(120));
        cars.add(new Opel(100));
        cars.add(new Ford(155));
        cars.add(new Opel(125));

        cars.remove(1);
        cars.remove(kia);

        System.out.println(cars.size());
        for (Car car:cars) {
            System.out.println("Start! " + car.getSpeed()  );
        }
    }
}
