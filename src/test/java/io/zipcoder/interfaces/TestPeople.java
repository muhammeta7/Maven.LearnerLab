package io.zipcoder.interfaces;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {


    Student joe = new Student(123449494, "Joe");
    Student jack = new Student(1239494, "Jack");
    static People<Student> students;

    @BeforeClass
    public static void beforeClass() {

    }

    @Before
    public void setUp(){
        students  = Students.getInstance();
    }


    @Test
    public void testAdd() {
        // Given
        Integer expected = 5;
        // When
        students.add(joe);
        Integer actual = students.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByPerson(){
        // Given
        Integer expected = 4;

        // When
        students.remove(joe);
        Integer actual = students.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById(){
        // Given
        students.getPersonList().stream().map(e -> e.getName()).forEach(System.out::println);
        System.out.println("----------------------------");
        students.add(joe);

        // When
        students.remove(joe.getId());
        students.getPersonList().stream().map(e -> e.getName()).forEach(System.out::println);
        Student expected = students.findById(jack.getId());

        // Then
        Assert.assertNull(expected);
    }


    @Test
    public void testFindById() {
        // Given
        People<Student> students = Students.getInstance();
        String expectedName = "Moe";
        // When
        Student actual = students.findById(1);
        // Then
        Assert.assertEquals(actual.getName(), expectedName);
    }


}








