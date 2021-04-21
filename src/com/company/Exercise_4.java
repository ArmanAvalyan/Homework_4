/* Create a program that takes two numbers as arguments (num, length)
and prints an array of multiples of num until the array length reaches length */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number of the array: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the length of the array: ");
        int lengthArray = scanner.nextInt();
        int[] arrayOfMultiples = new int[lengthArray];

        for (int i = 0; i < arrayOfMultiples.length; i++) {
            arrayOfMultiples[i] = firstNumber + i * firstNumber;
        }
        System.out.print("(" + firstNumber + ", " + lengthArray + ") → " + Arrays.toString(arrayOfMultiples));
    }
}

