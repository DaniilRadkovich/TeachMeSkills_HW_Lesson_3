package com.teachmeskills.lesson_3.task_6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] names = {"Kate", "Walter", "John", "Oliver", "Mike", "Jordan", "Peter", "Melissa", "Rose", "Ann"};
        System.out.println("Your array: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted array: " + Arrays.toString(names));
    }
}
