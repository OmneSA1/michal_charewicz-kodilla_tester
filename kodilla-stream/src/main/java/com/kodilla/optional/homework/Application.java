package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Monika");
        Teacher teacher2 = new Teacher("Beata");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Piotr", teacher1));
        students.add(new Student("Kamil", null));
        students.add(new Student("Krystian", teacher2));
        students.add(new Student("Karolina",null));
        students.add(new Student("Bartek", null));
        List<String> studentTeacherPairs = getStudentTeacherPairs(students);
        studentTeacherPairs.forEach(System.out::println);

    }
    public static List<String> getStudentTeacherPairs(List<Student> students) {
        List<String> pairs = new ArrayList<>();
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.map(Teacher::getName).orElse("<undefined>");
            pairs.add("Uczeń: " + student.getName() + ", Nauczyciel: " + teacherName);
        }
        return pairs;
    }
}
