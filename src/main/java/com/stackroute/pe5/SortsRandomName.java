package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortsRandomName {

    public ArrayList<String> randomNameSort(String[] input){

        Set<String> stringSet = new HashSet<>();
        for( String data : input)
            stringSet.add(data);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(stringSet);

        ArrayList<String> arrayList = new ArrayList<>(treeSet);

        return arrayList;
    }
}

