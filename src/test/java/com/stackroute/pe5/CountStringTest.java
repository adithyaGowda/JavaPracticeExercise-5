package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString countString;

    @Before
    public void setUp() throws Exception {
        countString = new CountString();
    }

    @After
    public void tearDown() throws Exception {
        countString = null;
    }

    @Test
    public void givenInputStringShouldReturnFrequency(){


        assertEquals("CountString{data={one=5, two=2, three=2}}", countString.checkingFrequency("one one -one___two,,three,one @three*one?two"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullInputShouldGiveException(){
        countString.checkingFrequency(null);
    }

    @Test
    public void givenInputStringMustCheckForNotEquality(){
        assertNotEquals(" ",countString.checkingFrequency("Hello world,Welcome to programming@910"));
    }

    @Test
    public void givenInputStringShouldReturnNotNullValue(){
        assertNotNull(countString.checkingFrequency("hello world"));
    }
}