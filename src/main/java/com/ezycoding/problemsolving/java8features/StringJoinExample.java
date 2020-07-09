package com.ezycoding.problemsolving.java8features;

import java.util.StringJoiner;

public class StringJoinExample {
    public static void main(String[] args) {
        String s1 = "kaushik";
        String s2 = "Talukder";
        String s3 = String.join("-", s1, s2);
        System.out.println(s3);

        StringJoiner j1 = new StringJoiner("-", "[", "]");
        j1.add("Kaushik");
        j1.add("Talukder");
        System.out.println(j1);

        StringJoiner j2 = new StringJoiner(",", "{", "}");
        j2.add("Joyantee");
        j2.add("Das");
        System.out.println(j2);
        System.out.println(j1.merge(j2));
//        System.out.println(j2.merge(j1));
    }
}
