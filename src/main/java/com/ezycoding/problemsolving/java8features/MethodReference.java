package com.ezycoding.problemsolving.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> list2 = Numbers.findNumbers(Arrays.asList(12, 5, 45, 18, 33, 24, 40), Numbers::isMoreThanFifty);
        System.out.println(list2);
    }
}

class Numbers {
    public static boolean isMoreThanFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }

    public static List<Integer> findNumbers(
            List<Integer> l, BiPredicate<Integer, Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : l) {
            if (p.test(i, i + 10)) {
                newList.add(i);
            }
        }
        return newList;
    }
}