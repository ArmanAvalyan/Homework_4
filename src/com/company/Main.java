// Exercise_1 Print the number of even ints in the given array

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 20);
            array[i] = random;
        }
        int countEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                countEvens++;
            }
        }
        System.out.println("countEvens(" + Arrays.toString(array) + ")  → " + countEvens);
    }
}
