package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListExampleTest {
    ArrayListExample arrayListExample;
    ArrayList input;
    ArrayList output;
    ArrayList outputEmpty;

    @Before
    public void setUp() throws Exception {
        arrayListExample = new ArrayListExample();
        input =  new ArrayList<>();
        output = new ArrayList<>();
        outputEmpty = new ArrayList();
    }

    @After
    public void tearDown() throws Exception {
        arrayListExample = null;
        input = null;
        output = null;
        outputEmpty = null;
    }

    @Test
    public void givenInputArraylistItemsMustReturnReplacedArraylist(){

        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        output.add("kiwi");
        output.add("Grape");
        output.add("Melon");
        output.add("Berry");

        assertEquals(output,arrayListExample.arrayListUpdate( input,"Apple","kiwi"));
        assertEquals(outputEmpty,arrayListExample.emptyArraylist(output));
    }

}