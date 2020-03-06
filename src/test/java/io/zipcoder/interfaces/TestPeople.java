package io.zipcoder.interfaces;

import org.junit.*;

public class TestPeople {

    private static Student joe = new Student(10, "Joe");;
    Student jack = new Student(12, "Jack");
    static People<Student> students;

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
//      students.getPersonList().stream().map(e -> e.getName()).forEach(System.out::println);
        students.add(jack);

        // When
        students.remove(jack.getId());
//        students.getPersonList().stream().map(e -> e.getName()).forEach(System.out::println);
        Student expected = students.findById(jack.getId());

        // Then
        Assert.assertNull(expected);
    }

    @Test
    public void testFindById() {
        // Given
        String expectedName = "Moe";
        // When
        Student moe = students.findById(1);
        String actual = moe.getName();
        // Then
        Assert.assertEquals(actual, expectedName);
    }

    @AfterClass
    public static void afterAll(){
        students.remove(joe);
    }


}








