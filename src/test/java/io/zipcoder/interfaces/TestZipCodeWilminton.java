package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilminton {

    ZipCodeWilmington zcw;
    Students students;
    Instructor instructor;


    @Before
    public void setup(){
        zcw = ZipCodeWilmington.getInstance();
        students = Students.getInstance();
        instructor = new Instructor(1, "Roberto");
    }

    @Test
    public void testHostLectureWithTeacher() {
        // Given
        Double expected = 4.0;

        // When
        zcw.hostLecture(instructor, 16);
        Double actual = zcw.getStudyMap().get(students.findById(1));

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testHostLectureWithId(){
        // Given
        Double expected = 8.0;

        // When
        zcw.hostLecture(1, 16);
        Double actual = zcw.getStudyMap().get(students.findById(2));

        // Then
        Assert.assertEquals(expected, actual);
    }


}
