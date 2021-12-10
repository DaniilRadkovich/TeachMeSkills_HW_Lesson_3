package com.teachmeskills.lesson_3.task_5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] myArray = {1, 45, 44, 7, 56, 79, 12, 13, 91, 48, 31, 103};
        int[] finalArray = new int[myArray.length];
        System.out.println("Your array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                finalArray[i] = 0;
            } else if (myArray[i] % 2 == 0) {
                finalArray[i] = myArray[i];
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(finalArray));
    }
}
