package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> map = new HashMap<>();
        String[] s = sentence.toLowerCase().split("\\W+");

        if (!sentence.isBlank()) {
            for (String a : s) {
                if (map.containsKey(a)) {
                    int count = map.get(a);
                    count++;
                    map.put(a, count);
                } else {
                    map.put(a,1);
                }
            }
        }
        return map;
    }
}
