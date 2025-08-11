package org.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntroduction  {
    public static void main(String args[]) {
        Integer array[] = new Integer[5];
        for(int i=0;i<5;i++) {
            array[i] = i;
        }

        AsList asList = new AsList();
        asList.asList(array);
    }
}
