package com.teachmeskills.lesson_3.task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array from 5 to 10: ");
        int size = sc.nextInt();
        sc.close();
        if (size < 5 || size >= 10) {
            System.out.println("Wrong size of the array!");
        }
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (0 + (Math.random() * 100));
        }
        System.out.println("Your array: " + Arrays.toString(myArray));
        int newLength = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                newLength++;
            }
        }
        int [] newArray = new int[newLength];
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]%2 == 0){
                newArray[counter]=myArray[i];
                counter++;
            }
        }
        System.out.println("Your new array: " + Arrays.toString(newArray));
    }
}
