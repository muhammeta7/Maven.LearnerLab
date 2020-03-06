package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void testInstructorsSingleton(){
        // Given
        Integer expected = 4;
        People teachers = Students.getInstance();

        // When
        Integer actual = teachers.count();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
