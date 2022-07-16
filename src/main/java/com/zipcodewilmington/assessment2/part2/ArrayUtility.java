package com.zipcodewilmington.assessment2.part2;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> s = new ArrayList<>();
        s.addAll(Arrays.asList(array1));
        s.addAll(Arrays.asList(array2));
        return (s.toArray(new Integer[0]));
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer [] s = new Integer[array.length];
        for (int x=0; x<array.length; x++){;
            if (x-index<0){
                s[array.length+x-index] = array[x];
            } else {
                s[x-index] = array[x];
            }
        }
        return s;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        ArrayList<Integer> s = new ArrayList<>();
        s.addAll(Arrays.asList(array1));
        s.addAll(Arrays.asList(array2));
        Integer[] arr = s.toArray(new Integer[0]);
        int count =0;
        for (int x=0; x<array1.length+ array2.length;x++) {
            if (arr[x].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int maxCount = 0;
        int freq = 0;
        for (int x = 0; x < array.length; x++) {
            int count = 0;
            for (int y = 0; y < array.length; y++) {
                if (array[x] == array[y]) {
                    count++;
                }
            }
            if (count > maxCount) {
                count = maxCount;
                freq = array[x];
            }
        }
        return freq;
    }
}
