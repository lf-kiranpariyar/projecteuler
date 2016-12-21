package com.logical.programs.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kiran on 8/2/16.
 */
public class FibonacciSeries {

    public static void generateFibonacciSeries(long num) {
        long f1 = 0l;
        long f2 = 1l;
        long sum;
        int count = 0;

        System.out.println(f1);
        System.out.println(f2);
        while (count <= num) {
            sum = (f1 + f2) % 3;
            f1 = f2;
            f2 = sum;
            System.out.println(sum);
            count++;
        }
    }

    public static List<Integer> generatePisanoSeries(Integer n) {
        Integer f1 = 0;
        Integer f2 = 1;
        Integer sum;
        List<Integer> pisanoSeries = new ArrayList<>();
        pisanoSeries.add(f1);
        pisanoSeries.add(f2);

        while (true) {
            sum = (f1 + f2) % n;
            if (f2 == 0 && sum == 1) {
                pisanoSeries.remove(pisanoSeries.size() - 1);
                break;
            }
            f1 = f2;
            f2 = sum;
            pisanoSeries.add(sum);
        }
        return pisanoSeries;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        generateFibonacciSeries(1000);
        List<Integer> pisanoSeries = generatePisanoSeries(10);
        System.out.println("pisano series : " + pisanoSeries);
        System.out.println("period : " + pisanoSeries.size());
        System.out.println("time : " + (System.nanoTime() - start) / 1000000000f + " second");

    }
}
