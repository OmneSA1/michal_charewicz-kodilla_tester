package com.kodilla.optional.homework;

public class Student {
    private String name;
    private Teacher teacher;
    public String getName() {
        return name;
    }

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    public Teacher getTeacher() {
        return teacher;
    }
}
