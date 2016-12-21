package com.projecteuler.programs;

public class PrimeFactor {

    public static void findLargestPrimeFactor(long inputNumber) {
        long factor = 2L;
        while(inputNumber !=1) {
            if(inputNumber%factor== 0) {
                while (inputNumber%factor== 0){
                    inputNumber = inputNumber/factor;
                    System.out.println(factor);
                }
            }
            factor++;
        }
    }

    public static void main(String[] args) {
        long inputNumber = 600851475143L;
        findLargestPrimeFactor(997799);
    }
}
