package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudentsInClasses = new ArrayList<>();

    public int getTotalNumberOfStudents() {
        int total = 0;
        for(int students:numberOfStudentsInClasses){
            total += students;
        }
        return total;
    }
    @Override
    public String toString() {
        return "School{" +
                "numberOfStudentsInClasses=" + numberOfStudentsInClasses +
                '}';
    }

    public School(List<Integer> numberOfStudentsInClasses) {
        this.numberOfStudentsInClasses = new ArrayList<>(numberOfStudentsInClasses);
    }

}
