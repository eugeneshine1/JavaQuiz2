package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length %2 ==0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {
        int size = start-stop;
        if (size<0) {
            size = -size;
        }
        Integer [] s =new Integer[size +1];
        for (int x = start,y=0; x<=stop; x++,y++) {
            s [y]= x;
        }
        return s;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] +array[1];

    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2] *array[array.length-1];
    }
}
