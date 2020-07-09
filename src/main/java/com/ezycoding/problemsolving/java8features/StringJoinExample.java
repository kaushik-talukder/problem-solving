package com.ezycoding.problemsolving.java8features;

import org.apache.commons.lang3.StringUtils;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        Stream<String> stm = Stream.of("Kaushik","Talukder","Joyantee","Das");
        String str = stm.map(StringUtils::lowerCase).collect(Collectors.joining("-"));
        System.out.println(str);
    }
}
