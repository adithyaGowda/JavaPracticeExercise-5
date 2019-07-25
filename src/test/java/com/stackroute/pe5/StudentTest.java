package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Maintest maintest;

    @Before
    public void setUp() throws Exception {
        maintest = new Maintest();
    }

    @After
    public void tearDown() throws Exception {
        maintest = null;
    }

    @Test
    public void input(){


        assertEquals("testing",maintest.testMethod(1));
    }
}