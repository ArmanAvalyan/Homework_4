// Given an array of ints, print true if every 2 that appears in the array is next to another 2

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter the array values: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        boolean twoTwo = true;
        for (int i : array) {
            if (i == 2) {
                count++;
            }
        }
        if (count % 2 != 0 || count == 0) {
            twoTwo = false;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] != 2) {
                    twoTwo = false;
                    break;
                } else if (array[i] == 2) {
                    i += 1;
                }
            }
        }
        System.out.println("twoTwo(" + Arrays.toString(array) + ") → " + twoTwo);
    }
}


