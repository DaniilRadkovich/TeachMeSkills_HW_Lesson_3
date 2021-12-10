package com.teachmeskills.lesson_3.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int first = 0;
        int second = 100;
        int averageFor1 = 0;
        int averageFor2 = 0;
        int[] myArray1 = new int[5];
        int[] myArray2 = new int[5];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = first + (int) (Math.random() * second);
        }
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = first + (int) (Math.random() * second);
        }
        System.out.println("Your first array: " + Arrays.toString(myArray1));
        System.out.println("Your second array: " + Arrays.toString(myArray2));
        for (int i = 0; i < myArray1.length; i++) {
            averageFor1 = averageFor1 + myArray1[i];
        }
        for (int i = 0; i < myArray2.length; i++) {
            averageFor2 = averageFor2 + myArray2[i];
        }
        if (averageFor1/5 == averageFor2/5) {
            System.out.println("Average values are equal!");
        } else {
            System.out.println(averageFor1 / 5);
            System.out.println(averageFor2 / 5);
        }
    }
}
