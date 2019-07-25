package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public Map<String, Boolean> characterCount(String[] input) {

        Map<String, Boolean> result = new HashMap<>();


            for (String data : input) {

                if (result.containsKey(data))
                    result.put(data, true);
                else
                    result.put(data, false);
            }
            return result;
    }
}
