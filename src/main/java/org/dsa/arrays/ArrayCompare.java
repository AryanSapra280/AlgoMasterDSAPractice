package org.dsa.arrays;

import org.dsa.general.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayCompare {
    public void compare(int arr1[], int [] arr2) {
        int comparedValue = Arrays.compare(arr1,arr2);
        switch(comparedValue) {
            case 0 -> System.out.println("equal array");
            case 1 -> System.out.println("first array is bigger");
            case -1 -> System.out.println("second array is bigger");
        }
        System.out.println();
    }
    public void compareArrayOfObjects(Student arr1[], Student arr2[]) {
        int comparedValue = Arrays.compare(arr1,arr2, Comparator.comparingInt(Student::age));
        switch(comparedValue) {
            case 0 -> System.out.println("equal array");
            case 1 -> System.out.println("first array is bigger");
            case -1 -> System.out.println("second array is bigger");
        }
        System.out.println();
    }
}
