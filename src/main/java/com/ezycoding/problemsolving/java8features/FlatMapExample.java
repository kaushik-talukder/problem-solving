package com.ezycoding.problemsolving.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("c", "d");
        List<String> l3 = Arrays.asList("e", "f");

        List<List<String>> bigList = Arrays.asList(l1, l2, l3);

        List<String> flatList = bigList.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(flatList);

        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        List<String> listOfAllChars = Arrays.stream(dataArray)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());

        System.out.println(listOfAllChars);
    }
}

