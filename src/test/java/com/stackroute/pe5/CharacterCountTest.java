package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

        
    }
}