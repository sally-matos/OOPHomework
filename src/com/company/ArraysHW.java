package com.company;

import java.util.Arrays;

import static java.lang.Math.pow;

public class ArraysHW {

    public static void main(String[] args) {
        printSumOfAllValuesInExampleArray();
        printMaxIndexInExampleArray();
        System.out.println(Arrays.toString(toPower(4, 2)));
    }

    static void printSumOfAllValuesInExampleArray() { // Question 1.
        double[ ] exampleArray = {1,5,6,5,4,1};

        double sum = 0;

        for (double number : exampleArray) {
            sum = sum + number;
        }

        System.out.println(sum);
    }

    static void printMaxIndexInExampleArray() { // Question 2.
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0]; // typo fixed

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){ // typo fixed

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println(index);
    }

    static int[] toPower(int size, int power) { // Question 3.
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) pow(i, power);
        }
        return output;
    }

}
