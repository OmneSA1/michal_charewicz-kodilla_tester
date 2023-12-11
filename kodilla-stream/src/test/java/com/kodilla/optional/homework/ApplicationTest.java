package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testGetStudentTeacherPairsWithTeacher() {
        // Given
        Teacher teacher = new Teacher("Beata");
        Student student = new Student("Kamil", teacher);
        List<Student> students = Arrays.asList(student);

        // When
        List<String> result = Application.getStudentTeacherPairs(students);

        // Then
        assertEquals(1, result.size());
        assertEquals("Uczeń: Kamil, Nauczyciel: Beata", result.get(0));
    }

    @Test
    public void testGetStudentTeacherPairsWithoutTeacher() {
        // Given
        Student student = new Student("Krystian", null);
        List<Student> students = Arrays.asList(student);

        // When
        List<String> result = Application.getStudentTeacherPairs(students);

        // Then
        assertEquals(1, result.size());
        assertEquals("Uczeń: Krystian, Nauczyciel: <undefined>", result.get(0));
    }
}