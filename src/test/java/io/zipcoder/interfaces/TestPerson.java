package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void TestConstructor(){

        // Given
        long id = 128282829;
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
    public void TestSetName(){

        // Given
        Person person = new Person(102929, null);
        String expected = "Moe";
        person.setName(expected);

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
        
    }
}

