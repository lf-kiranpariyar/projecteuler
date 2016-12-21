package com.projecteuler.programs;

import java.util.HashSet;
import java.util.Set;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.Find the sum of all
 * the multiples of 3 or 5 below 1000.
 *
 */

public class SumOfMultiple {

    public static int calculateSumOfMultiple1(int limit,int[] input) {
        Set<Integer> multiple = new HashSet<>();
        for(int i=1; i<limit; i++){
            for(int j=0; j < input.length; j++) {
                if( i % input[j] == 0){
                    multiple.add(i);
                }
            }
        }
//        System.out.println("Multiples :" + multiple);
        int sum = multiple.stream().reduce(0, (x,y) -> x+y);
        return sum;
    }

    public static int calculateSumOfMultiple2(int limit,int[] input) {
        Set<Integer> multiple = new HashSet<>();
        for(int i=0; i < input.length; i++){
            int value = 0;
            for(int j = 1; value < limit; j++) {
                value = input[i] * j;
                multiple.add(value);
            }
            multiple.remove(value);
        }
//        System.out.println("Multiples :" + multiple);
        int sum = multiple.stream().reduce(0, (x,y) -> x+y);
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(calculateSumOfMultiple1(1000,new int[]{3,5}));
        long end = System.nanoTime();
        System.out.println("Time taken first:" + (end -  start) + " nano second");

        start = System.nanoTime();
        System.out.println(calculateSumOfMultiple2(1000,new int[]{3,5}));
        end = System.nanoTime();
        System.out.println("Time taken end:" + (end - start) + " nano second");
    }
}
