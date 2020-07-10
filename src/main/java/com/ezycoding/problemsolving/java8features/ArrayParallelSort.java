package com.ezycoding.problemsolving.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayParallelSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 1, 2};
        Arrays.parallelSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        Integer[] arr1 = new Integer[]{3, 4, 5, 1, 2};
        Arrays.parallelSort(arr1);
        Arrays.stream(arr1).forEach(System.out::println);

        List<Double> list = Arrays.stream(arr1).map(Double::new).collect(Collectors.toList());
        System.out.println(list);
    }
}