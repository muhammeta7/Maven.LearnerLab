package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        // Given
        Instructor instructor = new Instructor(123, "Roberto");

        // When
        boolean actual = instructor instanceof Teacher;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        // Given
        Instructor instructor = new Instructor(123, "Nobles");

        // When
        boolean actual = instructor instanceof Person;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach(){
        // Given
        Instructor instructor = new Instructor(123, "Nobles");
        Student student = new Student(345, "Moe");
        double expected = 5;

        // When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void testLecture(){
        // Given
        Instructor instructor = new Instructor(123, "Nobles");
        Student student1 = new Student(1, "Moe");
        Student student2 = new Student(2, "Kevin");
        Student student3 = new Student(3, "Von");
        Student[] studentsExpected = {student1, student2, student3};

        for(int i = 0; i < 3; i++){
            studentsExpected[i].learn(8);
        }

        double expected = 16.0;

        // When
        instructor.lecture(studentsExpected, 24);

        Double actual = studentsExpected[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, .001);
    }

}
