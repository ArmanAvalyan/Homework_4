package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int[] newArray = new int[arrayLength];
        for (int i = 0; i < newArray.length; i++) {
            int random = (int)(Math.random() * 5);
            newArray[i] = random;
        }
        boolean canBalance = false;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i; j < newArray.length; j++) {
                sum += newArray[i];
                sum1 += newArray[j];
                if (sum == sum1){
                    canBalance = true;
                }
            }


        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(canBalance);



    }
}
