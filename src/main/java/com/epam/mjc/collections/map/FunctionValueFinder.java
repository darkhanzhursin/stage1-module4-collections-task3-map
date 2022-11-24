package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return (functionMap.containsValue(requiredValue)) ? true : false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            int calc = iterator.next()*5+2;
            integerMap.put(iterator.next(), calc);
        }
        return integerMap;
    }
}
