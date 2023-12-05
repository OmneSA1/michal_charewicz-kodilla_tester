package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> institution = new HashMap<>();

        Principal principalMarek = new Principal("Marek", "Kostrzewa");
        Principal principalMariusz = new Principal("Mariusz", "Wlazło");
        Principal principalJanusz = new Principal("Janusz", "Lakomy");

        School schoolFirst = new School(List.of(28,29,30,28,33,31));
        School schoolSecond = new School(List.of(30,30,31,33,29));
        School schoolThird = new School(List.of(28,26,29));

        institution.put(schoolFirst, principalMarek);
        institution.put(schoolSecond, principalMariusz);
        institution.put(schoolThird,principalJanusz);

        for (Map.Entry<School,Principal> entry : institution.entrySet()) {
            System.out.println("School: " + entry.getKey() + ", Principal: " + entry.getValue() + ", Total Students: " + entry.getKey().getTotalNumberOfStudents());
        }
    }
}
