/* Print the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Fill the array randomly/true/ or from the console/false/?: ");
        boolean request = scanner.nextBoolean();

        if (request) {
            for (int i = 0; i < array.length; i++) {
                int random = (int) (Math.random() * 13);
                array[i] = random;
            }
        } else {
            System.out.println("Enter values: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }
        int sum13 = 0;
        int unluckyNumber = 13;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != unluckyNumber) {
                sum13 += array[i];
            } else if (array[i] == unluckyNumber)
                break;
        }
        System.out.println("sum13(" + Arrays.toString(array) + ") → " + sum13);
    }
}