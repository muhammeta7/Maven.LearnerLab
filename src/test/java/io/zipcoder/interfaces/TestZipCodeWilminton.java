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
        for (Student student : students.getArray()) {
            student.learn(4);
        }
        instructor = new Instructor(1, "Roberto");
    }

    @Test
    public void testHostLectureWithTeacher() {
        // When
        zcw.hostLecture(instructor, 16);
        Students actual = zcw.getStudents();

        // Then
        Assert.assertEquals(students, actual);
    }


    @Test
    public void testHostLectureWithId(){
        // When
        zcw.hostLecture(1, 16);
        Students actual = zcw.getStudents();

        // Then
        Assert.assertEquals(students, actual);
    }


}
