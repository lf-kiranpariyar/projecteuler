package com.projecteuler.programs;

/**
 * Created by kiran on 7/20/16.
 */
public class EvenFibonacciSum {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 2;
        int sum = 0;
        int evenValueSum = 2;
        System.out.println(f1);
        System.out.println(f2);
        while(sum < 50) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            System.out.println(sum);
            if(sum % 2 == 0) {
                evenValueSum += sum;
            }
        }
        System.out.println("Result :" + evenValueSum);
    }
}
