package com.logical.programs.recursion;

/**
 * Created by kiran on 11/2/16.
 */
public class Factorial {

    private static Integer fact(int n){
        return factTail(n, 1);
    }

    private static Integer factTail(int n, Integer accu){
        if(n<=1) return accu;

        return factTail(n-1, accu*n);
    }

    private static Integer simpleFact(Integer n) {
        if (n <= 1) return 1;

        return n*simpleFact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}

