package com.projecteuler.programs;

/**
 * Created by kiran on 7/20/16.
 */
public class SumOfMultiple {

    public int calculateSumOfMultiple(int limit,int[] multiplesOf) {
        int sum = 0;
        for(int i=1; i<limit; i++){
            for(int j=0; j < multiplesOf.length; j++) {
                if( i % multiplesOf[j] == 0){
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfMultiple sumOfMultiple = new SumOfMultiple();
        System.out.println(sumOfMultiple.calculateSumOfMultiple(10000,new int[]{3,5}));
    }
}
