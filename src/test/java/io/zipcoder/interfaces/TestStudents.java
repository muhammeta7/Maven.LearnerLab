package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {

    @Test
    public void testStudentSingleton(){
        // Given
        Students instance = Students.getInstance();
        int i = 1;
        for (Student s: instance.getArray()) {
            Assert.assertNotNull(s);
            Assert.assertEquals(s.getId(), i);
            i++;
        }
    }

}




