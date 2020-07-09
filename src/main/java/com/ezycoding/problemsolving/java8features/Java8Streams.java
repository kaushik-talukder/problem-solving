package com.ezycoding.problemsolving.java8features;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        Customer.builder().fname("").lname("").build();
        list.add(Customer.builder().fname("Kaushik").lname("Talukder").build());
        list.add(Customer.builder().fname("Joyantee").lname("Das").build());
        list.add(Customer.builder().fname("Anik").lname("Talukder").build());
        list.add(Customer.builder().fname("Sayanika").lname("Ghosh").build());
        // System.out.println(list.stream().count());

        // list.stream().map(Customer::getLname).sorted(Collections.reverseOrder()).forEach(System.out::println);

        // Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Customer::getLname, Collectors.counting()));

        // System.out.println(list.stream().anyMatch(l -> l.getFname() == "Kaushik"));

        List<Customer> newList = list.stream().filter(l -> "Talukder".equals(l.getLname())).collect(Collectors.toList());

        System.out.println(newList);

        String s = list.stream().map(Customer::getFname).reduce("", (cust1, cust2) -> (cust1 + cust2));
        System.out.println(s);

        System.out.println(list.stream().collect(Collectors.groupingBy(Customer::getLname, Collectors.toList())));

        // Use of Stream class
        Stream<String> stringStream = Stream.of("Kaushik", "Talukder", "Anik", "Setu");
        List<String> ll = stringStream.filter(StringUtils::isNotBlank)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(ll);
    }
}

@Data
@Builder
class Customer {
    private String fname;
    private String lname;
}