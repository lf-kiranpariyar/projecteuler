package com.logical.programs.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by kiran on 8/2/16.
 */
public class FibonacciSeries {

    private static ArrayList<Long> fibonnaciNumbers;

    public static Long generateFibonacciSeriesWithMemorization(Integer num) {
        if(num <= 1)
            return 1L;

        Long fibonnaciNumber = fibonnaciNumbers.get(num);
        if( fibonnaciNumber != 0L) {
            return fibonnaciNumber;
        }

        fibonnaciNumber = generateFibonacciSeriesWithMemorization(num - 1) + generateFibonacciSeriesWithMemorization(num - 2);
        fibonnaciNumbers.add(num,fibonnaciNumber);
        return fibonnaciNumber;
    }

    public static Long generateFibonacciSeries(Integer num) {
        if(num <= 1)
            return 1L;
        return generateFibonacciSeries(num - 1) + generateFibonacciSeries(num - 2);
    }

    public static void main(String[] args) {
        Long[] arrays = new Long[100];
        for(int i =0; i<arrays.length; i++){
            arrays[i] = 0L;
        }
        fibonnaciNumbers = new ArrayList<>(Arrays.asList(arrays));

        /*
        Long start = System.currentTimeMillis();
        System.out.println(generateFibonacciSeries(40));
        Long end = System.currentTimeMillis();
        System.out.println((end- start));
        */
        Long start = System.currentTimeMillis();
        System.out.println(generateFibonacciSeriesWithMemorization(40));
        Long end = System.currentTimeMillis();
        System.out.println((end- start));

//        int term = 8;
//        for(int i = 0; i < term; i++){
//            System.out.println(generateFibonacciSeries(i));
//        }
    }
}
