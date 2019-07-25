package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    Map<String, Boolean> result = new HashMap<>();

    @Override
    public String toString() {
        return "CharacterCount{" +
                "output=" + result +
                '}';
    }

    public String characterCount(String[] input) {

            for (String data : input) {

                if (result.containsKey(data))
                    result.put(data, true);
                else
                    result.put(data, false);

            }
            return toString();
    }
}
