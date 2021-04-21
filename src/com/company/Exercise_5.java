/* Given a non-empty array, print true if there is a place to split the
array so that the sum of the numbers on one side is equal to the sum of
the numbers on the other side */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        System.out.print("Enter the array values: ");

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean canBalance = false;
        int sumArrayNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            sumArrayNumbers += array[i];
        }
        int leftSide = 0;
        int rightSide = sumArrayNumbers;
        for (int i = 0; i < array.length; i++) {
            leftSide += array[i];
            rightSide -= array[i];
            if (leftSide == rightSide) {
                canBalance = true;
                break;
            }
        }
        System.out.println("canBalance(" + Arrays.toString(array) + ") → " + canBalance);
    }
}
