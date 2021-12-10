package com.teachmeskills.lesson_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 2, 17, 22, 9, 4, 3, 99, 123, 4, 5, 76};
        System.out.println("Your array: " + Arrays.toString(myArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose number to delete: ");
        int number = sc.nextInt();
        sc.close();
        int newLength = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (number != myArray[i]) {
                newLength++;
            }
        }
        int[] newArray = new int[newLength];
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (number != myArray[i]) {
                newArray[counter] = myArray[i];
                counter++;
            }
        }
        System.out.println("Your new array: " + Arrays.toString(newArray));
    }
}
