package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortsRandomNameTest {
    SortsRandomName sortsRandomName;

    @Before
    public void setUp() throws Exception {
        sortsRandomName = new SortsRandomName();
    }

    @After
    public void tearDown() throws Exception {
        sortsRandomName = null;
    }

    @Test
    public void input(){

        String[] data = {"John","Robert","Andy","Berlin"};
        ArrayList<String> result = new ArrayList<>(Arrays.asList("Andy", "Berlin", "John", "Robert")) ;

        assertEquals(result,sortsRandomName.randomNameSort(data));

    }
}