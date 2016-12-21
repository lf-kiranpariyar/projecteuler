package com.logical.programs.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kiran on 9/4/16.
 */
public class Combination {

    public static List<String> generateCombination(List<String> array) {
        if(array.size() == 1) return array;
        return combine(array.get(0), generateCombination(array.subList(1, array.size())));
    }


    public static List<String> combine(String s, List<String> list) {
        List<String> result = new ArrayList<>();
        result.add(s);
        result.addAll(list);

        for (String str: list) {
            result.add(s+str);
        }
        return result;
    }

    public static void main(String[] args) {
//        List<String> testList = Arrays.asList("b","c","bc");
//        String s = "a";
//        System.out.println(combine(s, testList));
        System.out.println(generateCombination(Arrays.asList("a","b","c","d")));
    }
}
