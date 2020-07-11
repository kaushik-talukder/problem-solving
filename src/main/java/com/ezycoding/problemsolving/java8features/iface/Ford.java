package com.ezycoding.problemsolving.java8features.iface;

public interface Ford extends Car {
    default void changeGear() {
        System.out.println("Gear changed in Ford");
    }
}
