package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {


    @Test
    public void testStudentSingleton(){
        // Given
        Integer expected = 4;
        Students instance = Students.getInstance();


        // When
        Integer actual = instance.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

}




