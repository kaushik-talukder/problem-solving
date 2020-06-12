package com.ezycoding.problemsolving.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Kaushik");
		names.add("Talukder");
		names.add("Joyantee");
		names.add("Das");

		ConsumerTask printTask = someVariable -> System.out.println(someVariable);
		names.forEach(name -> printTask.accept(name));

		SupplierTask randomTask = () -> new Double((int) (Math.random() * 1000D));
		System.out.println(randomTask.get());

		CheckNull<String> checkNull = str -> Objects.isNull(str);
		System.out.println(checkNull.test(null));

		// General purpose Functional Interface, takes one arg and returns value
		Function<Integer, Double> randomValue = (multiplier) -> Math.random() * multiplier;
		System.out.println(randomValue.apply(100));
	}
}

interface ConsumerTask extends Consumer<String> {
	// Consumer FI is used to take one arg, but no return type
	// Java Consumer implementation could be printing out a value, or writing it to
	// a file, or over the network etc
}

interface SupplierTask extends Supplier<Double> {
	// The Java Supplier interface is a functional interface that represents an
	// function that supplies a value of some sorts.
	// The Supplier interface can also be thought of as a factory interface.
}

interface CheckNull<T> extends Predicate<T> {
	// Takes one arg, returns boolean
}
