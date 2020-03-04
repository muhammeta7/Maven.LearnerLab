package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        // Given
        long id = 123456;
        String name = "Moe";
        Person person = new Person(id, name);

        // When
        long expectedId = person.getId();
        String expectedName = person.getName();


        // Then
        Assert.assertEquals(id, expectedId);
        Assert.assertEquals(name, expectedName);
    }

    @Test
    public void testSetName(){
        // Given
        Person person = new Person(123456, null);
        String expected = "Moe";
        person.setName(expected);

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

