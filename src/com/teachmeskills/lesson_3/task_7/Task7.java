package com.teachmeskills.lesson_3.task_7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] myArray = {4, 7, 2, 11, 1, 7, 85, 69, 41, 12, 38, 44, 76};
        System.out.println("Your array: " + Arrays.toString(myArray));
        boolean isSorted = false;
        int help;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    isSorted = false;
                    help = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = help;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }
}
