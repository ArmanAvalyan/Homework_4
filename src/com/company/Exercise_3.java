package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = scanner.nextInt();
        int[] array = new int[l];
        System.out.print("Fill the array randomly/true/ or from the console/false/?: ");
        boolean request = scanner.nextBoolean();
        if (request) {
            for (int i = 0; i < array.length; i++) {
                int random = (int) (Math.random() * 11 + 13);
                array[i] = random;
            }
        } else if (!request) {
            System.out.println("Enter values: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }
        boolean twoTwo = false;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2) {
                i++;
                count++;
            }
            if (count == 2) {
                twoTwo = true;
                count = 0;
            }
        }
        System.out.println(Arrays.toString(array) + twoTwo);
    }
}
