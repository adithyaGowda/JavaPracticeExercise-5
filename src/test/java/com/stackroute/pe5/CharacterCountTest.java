package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CharacterCountTest {
    CharacterCount characterCount;

    @Before
    public void setUp() throws Exception {
        characterCount = new CharacterCount();
    }

    @After
    public void tearDown() throws Exception {
        characterCount = null;
    }

    @Test
    public void givenStringArrayShouldReturnMap(){
        String[] input = {"a","b","c","d","a","c","c"};

        assertEquals("CharacterCount{output={a=true, b=false, c=true, d=false}}",characterCount.characterCount(input));
    }

    @Test
    public void givenStringArrayShouldValidateForNotEquality(){
        String[] input = {"a","b","c","d","a","c","c"};

        assertNotEquals("CharacterCount{output={a=true, b=true, c=true, d=true}}",characterCount.characterCount(input));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullInputShouldReturnException(){

        characterCount.characterCount(null);
    }

    @Test
    public void givenInputStringVaueShouldReturnSomeValue(){
        String[] input = {"a","b","c","d","a","c","c"};

        assertNotNull("CharacterCount{output={a=true, b=false, c=true, d=false}}",characterCount.characterCount(input));

    }
}