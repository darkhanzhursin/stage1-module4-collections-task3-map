package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.putAll(sourceMap);

        for (Map.Entry<Integer, String> e : integerStringMap.entrySet()) {
            if (map.containsKey(e.getValue())) {
                if (map.get(e.getValue()) > e.getKey()) {
                    map.replace(e.getValue(), map.get(e.getValue()), e.getKey());
                }
            } else {
                map.put(e.getValue(), e.getKey());
            }
        }
        return map;
    }
}
