// Given an array of ints, print true if every 2 that appears in the array is next to another 2

package com.company;

import java.util.Arrays;

public class Exercise_3 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 2, 2, 2, 2};
        int count = 0;
        boolean twoTwo = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count++;
            }
        }
        if (count % 2 != 0 || count == 0) {
            twoTwo = false;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 2 && array[i + 1] != 2) {
                    twoTwo = false;
                    break;
                }
                if (array[i] == 2 && array[i + 1] == 2) {
                    i += 2;
                }
            }
        }
        System.out.println("twoTwo(" + Arrays.toString(array) + ") → " + twoTwo);
    }
}

