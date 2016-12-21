package com.projecteuler.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by kiran on 7/24/16.
 */
public class PalindromNumber {

    public static boolean isPalindromNumber(Integer numberToCheck) {
        Integer newNumber = 0;
        for (Integer digit : findDigits(numberToCheck)) {
            newNumber = newNumber * 10 + digit;
        }

        if (Objects.equals(numberToCheck, newNumber)) {
            return true;
        }
        return false;
    }

    public static List<Integer> findDigits(Integer num) {
        List<Integer> digits = new ArrayList<Integer>();
        while (num != 0) {
            digits.add(num % 10);
            num = num / 10;
        }
        return digits;
    }

    public static Integer findLargestPalidrom() {
        int largestNum = 999*999;
        int num = largestNum;
        while(!isPalindromNumber(num)){
            num--;
        }
        return num;
    }

    public static void main(String[] args) {
//        System.out.println("Number is Palindrom :" + isPalindromNumber(123454321));
        System.out.println("Largest Palidrom is :" + findLargestPalidrom());
    }
}
