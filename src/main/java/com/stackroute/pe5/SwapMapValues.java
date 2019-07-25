package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class SwapMapValues {


    public String swapValues(Map<String, String> mapInput){

        String temp = mapInput.get("val1");
        mapInput.replace("val2",temp);
        mapInput.replace("val1"," ");

        return mapInput.toString();
    }
}
