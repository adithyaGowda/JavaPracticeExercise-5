package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListExampleTest {
    ArrayListExample arrayListExample;

    @Before
    public void setUp() throws Exception {
        arrayListExample = new ArrayListExample();

    }

    @After
    public void tearDown() throws Exception {
        arrayListExample = null;

    }

    @Test
    public void givenInputArraylistItemsMustReturnReplacedArraylist(){

        ArrayList<String> input = new ArrayList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        ArrayList<String> output = new ArrayList<>(Arrays.asList("kiwi","Grape","Melon","Berry"));
        ArrayList<String> outputEmpty = new ArrayList<>();

        assertEquals(output,arrayListExample.arrayListUpdate( input,"Apple","kiwi"));
        assertEquals(outputEmpty,arrayListExample.emptyArraylist(output));
    }

    @Test
    public void givenInputArraylistItemsMustCheckForNotEquality(){

        ArrayList<String> input1 = new ArrayList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        ArrayList<String> output1 = new ArrayList<>(Arrays.asList("Melon","Berry"));
        ArrayList<String> outputEmpty1 = new ArrayList<>();

        assertNotEquals(output1,arrayListExample.arrayListUpdate( input1," ","kiwi"));

    }

    @Test(expected = NullPointerException.class)
    public void givenNullInputShouldThrowException(){

        arrayListExample.arrayListUpdate(null,"hey","hello");

    }


}