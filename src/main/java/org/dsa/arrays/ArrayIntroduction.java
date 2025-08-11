package org.dsa.arrays;

import org.dsa.general.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntroduction  {
    public static void main(String args[]) {

        // Arrays.asList
        Integer array[] = new Integer[5];
        for(int i=0;i<5;i++) {
            array[i] = i;
        }
        AsList asList = new AsList();
        asList.asList(array);
        System.out.println();

        //Arrays.compare with primitive
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for(int i=0;i<5;i++) {
            arr1[i] = i;
        }
        for(int i=0;i<5;i++) {
            arr2[i] = i;
        }
        ArrayCompare arrayCompare = new ArrayCompare();
        arrayCompare.compare(arr1,arr2);

        //Arrays.compare with Object
        Student student1[] = new Student[3];
        Student student2[] = new Student[3];
        for(int i=0;i<3;i++) {
            student1[i] = new Student("Aryan",i);
            student2[i] = new Student("Naman", i+2);
        }
        arrayCompare.compareArrayOfObjects(student1,student2);
    }
}
