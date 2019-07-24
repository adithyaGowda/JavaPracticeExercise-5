package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public List arrayListUpdate(ArrayList input,String element, String replace){

        System.out.println(input);

        if (input.contains(element)){

            int i = input.indexOf(element);
            input.set(i,replace);

        }
        System.out.println(input);

        return input;
    }

    public List emptyArraylist(ArrayList input){

        input.removeAll(input);

        return input;
    }
}
