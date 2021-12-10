package com.teachmeskills.lesson_3.task_2;

import java.awt.geom.Area;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        sc.close();
        int first = 0;
        int second = 100;
        int average = 0;
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = first + (int) (Math.random() * second);
        }
        System.out.println("Your array: "+Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("Sorted array: "+Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            average = average + myArray[i];
        }
        System.out.println("Minimal value: " + myArray[0]);
        System.out.println("Maximal value: " + myArray[myArray.length - 1]);
        System.out.println("Average value: " + average/size);
    }

}
