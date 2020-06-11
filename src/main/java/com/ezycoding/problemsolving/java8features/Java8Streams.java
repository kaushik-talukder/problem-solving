package com.ezycoding.problemsolving.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.Data;

public class Java8Streams {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(Customer.builder().fname("Kaushik").lname("Talukder").build());
		list.add(Customer.builder().fname("Joyantee").lname("Das").build());
		list.add(Customer.builder().fname("Anik").lname("Talukder").build());
		list.add(Customer.builder().fname("Sayanika").lname("Ghosh").build());

		// System.out.println(list.stream().count());

		// list.stream().map(Customer::getLname).sorted(Collections.reverseOrder()).forEach(System.out::println);

		// Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Customer::getLname, Collectors.counting()));
		
		// System.out.println(list.stream().anyMatch(l -> l.getFname() == "Kaushik"));

		List<Customer> newlist = list.stream().filter(l -> l.getLname() == "Talukder").collect(Collectors.toList());
		
		System.out.println(newlist);
		
		//System.out.println(map);
	}
}

@Data
@Builder
class Customer {
	private String fname;
	private String lname;
}