package com.ezycoding.problemsolving.java8features;

import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        // Exact match
        String input = "xy", regex = "xy";
        System.out.println(Pattern.matches(regex, input));

        input = "12345s"; regex = "\\d+\\D";
        System.out.println(Pattern.matches(regex, input));

        input = "kaushik_talukder@gmail.com"; regex = "^[a-zA-Z0-9._]+@[a-zA-Z]+.[a-zA-Z]+$";
        System.out.println(Pattern.matches(regex, input));
    }
}
