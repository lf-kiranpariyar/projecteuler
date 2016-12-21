package com.projecteuler.programs;

import java.util.Arrays;

/**
 * Created by kiran on 11/17/16.
 */
public class SmallestMultiple {


    public static long findSmallestMultipleDivisibleByNumbers(int maxNumber) {
        int smallestMultiple = maxNumber;
        boolean isDivisible = false;
        while (true) {
            for (int i = 1; i <= maxNumber; i++) {
                if (smallestMultiple % i == 0) {
                    isDivisible = true;
                } else {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                break;
            }
            smallestMultiple++;
        }
        return smallestMultiple;
    }


    public static void main(String[] args) {
        /*
        int n = 20;
        int[] x = new int[n];
        long[] y = new long[n];
        for (int i = 1; i <=n ; i++) {
            x[i-1] = i;
            y[i-1] = findSmallestMultipleDivisibleByNumbers(i);
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        */

        System.out.println("Smallest Multiple : " + findSmallestMultipleDivisibleByNumbers(15));
    }
}
