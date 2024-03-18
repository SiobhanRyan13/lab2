package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String inputText = "hello";
        Task3 task = new Task3();
        ArrayList<String> result = task.removeDuplicates(inputText);
        Set<String> resultSet = new HashSet<>(result);
        // Student should write tests here
        assertEquals(result.size(), resultSet.size());
        for (char ch : inputText.toCharArray()) {
            assertEquals(1, result.stream().filter(s -> s.equals(String.valueOf(ch))).count());
        }

    }

    @Test
    public void test_removeDuplicates_average(){
        // Student should write tests here

    }

    @Test
    public void test_removeDuplicates_worst(){

        // Student should write tests here

    }

    @Test
    public void test_areTheseAnagrams_best(){
        // Student should write tests here

    }

    @Test
    public void test_areTheseAnagrams_average(){
        // Student should write tests here

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        // Student should write tests here

    }

}
