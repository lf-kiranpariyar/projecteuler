package com.logical.programs.recursion;

/**
 * Created by kiran on 8/2/16.
 */
public class GreatestCommonDivisor {

    public static int findGCD(int num1, int num2) {
       int remainder =  num2 % num1;
       if( remainder == 0){
           return num1;
       }else {
           num2 = num1;
           num1 = remainder;
       }
       return findGCD(num1,num2);
    }

    public static void main(String[] args) {
        System.out.println(findGCD(6,9));
    }
}
