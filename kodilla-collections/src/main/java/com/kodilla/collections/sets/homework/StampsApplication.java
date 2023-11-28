package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stork",43.0,31.25, true ));
        stamps.add(new Stamp("Sunflower",39.5,31.25,false));
        stamps.add(new Stamp("Poppies",90.0,70.0,true));
        stamps.add(new Stamp("Football", 43.0,31.25,true));
        stamps.add(new Stamp("Stork",43.0,31.25, true ));
        stamps.add(new Stamp("Stork",43.0,31.25, true ));
        stamps.add(new Stamp("Football", 43.0,31.25,true));

        System.out.println(stamps.size());

        for (Stamp stamp:stamps) {
            System.out.println(stamp);
        }
    }
}
