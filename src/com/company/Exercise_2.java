/* Print the sum of the numbers in the array, returning 0 for an empty array. Except the number
13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = scanner.nextInt();
        int[] arrayNumbers = new int[l];
        System.out.print("Fill the array randomly/true/ or from the console/false/?: ");
        boolean request = scanner.nextBoolean();
        if (request) {
            for (int i = 0; i < arrayNumbers.length; i++) {
                int random = (int) (Math.random() * 11 + 13);
                arrayNumbers[i] = random;
            }
        } else if (!request) {
            System.out.println("Enter values: ");
            for (int i = 0; i < arrayNumbers.length; i++) {
                arrayNumbers[i] = scanner.nextInt();
            }
        }
        int sum13 = 0;
        int unluckyNumber = 13;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] != unluckyNumber) {
                sum13 += arrayNumbers[i];
            } else if (arrayNumbers[i] == unluckyNumber)
                break;
        }
        System.out.println("sum13(" + Arrays.toString(arrayNumbers) + ") → " + sum13);
    }
}