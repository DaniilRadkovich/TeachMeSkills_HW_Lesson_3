package com.teachmeskills.lesson_3.task_0;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for searching: ");
        int number = sc.nextInt();
        int result = 0;
        sc.close();
        int[] myArray = {1, 5, 32, 12, 76, 44, 104, 91};
        for (int i = 0; i < myArray.length; i++) {
            if (number == myArray[i]) {
                result = 1;
            }
        }
        if (result == 1) {
            System.out.println("This number is in the array!");
        } else {
            System.out.println("This number is not in the array!");
        }
    }
}
