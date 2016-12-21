package com.logical.programs.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kiran on 9/22/16.
 */
public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(5);
            add(4);
            add(1);
        }};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        Integer number = scanner.nextInt();

        getMinNumOfCoins(list, 8);
    }

    private static void getMinNumOfCoins(List<Integer> list, Integer number) {
        Integer count = 0;
        for (int i = 0; number != 0 && i <= list.size() - 1; i++) {
            count = count + number / list.get(i);
            number = number % list.get(i);
        }
        System.out.println("Answer is : " + count);
    }
}
