package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SwapMapValuesTest {
    SwapMapValues swapMapValues;

    @Before
    public void setUp() throws Exception {
        swapMapValues = new SwapMapValues();
    }

    @After
    public void tearDown() throws Exception {
        swapMapValues = null;
    }

    @Test
    public void givenInputMapValuesshouldReturnSwappedValues(){
        Map<String,String> input = new HashMap<>();
        input.put("val1","Hello");
        input.put("val2","world");

        assertEquals("{val2=Hello, val1= }",swapMapValues.swapValues(input));
    }

    @Test
    public void givenInputMapValuesshouldCheckForNotEqualValues(){
        Map<String,String> input = new HashMap<>();
        input.put("val1","Hello");
        input.put("val2","world");

        assertNotEquals("{val2=, val1=world }",swapMapValues.swapValues(input));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullInputShouldReturnNullPointerException(){
        swapMapValues.swapValues(null);
    }

    @Test
    public void givenInputShouldReturnNotNullVlaues(){
        Map<String,String> input = new HashMap<>();
        input.put("val1","Hello");
        input.put("val2","world");
        assertNotNull(" ",swapMapValues.swapValues(input));
    }
}