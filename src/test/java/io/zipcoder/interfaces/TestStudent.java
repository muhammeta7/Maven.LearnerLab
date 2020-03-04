package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void TestStudentInstanceOfLearner(){
        // Given
        Student student = new Student(123, "Moe");

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void TestStudentInstanceOfPerson(){
        // Given
        Student student = new Student(123, null);

        // When
        boolean actual = student instanceof Person;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void TestLearnerMethod(){
        // Given
        Student student = new Student(123, null);
        student.learn(5);
        double expected = 5;

        // When
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, .001);

    }

}

