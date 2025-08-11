package org.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
    public void asList(Integer[]array) {
        /* Helping Methods in Arrays */
        /* 1. Arrays.asList(arg[])
                1.1 arg[] must be of Wrapper class not primitive
                1.2 This gives unmodifiable list
         */
        List<Integer> unmodifiableList = Arrays.asList(array);
        for(Integer integer: unmodifiableList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //To get modifiable list

        ArrayList<Integer> modifiableList = new ArrayList<>(unmodifiableList);
        modifiableList.add(10);
        for(Integer integer: modifiableList) {
            System.out.print(integer + " ");
        }
    }
}
