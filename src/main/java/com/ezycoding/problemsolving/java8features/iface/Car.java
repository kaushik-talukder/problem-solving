package com.ezycoding.problemsolving.java8features.iface;

public interface Car {
    default void changeGear() {
        System.out.println("Gear changed in Car");
    }

    void showModel();

    static void applyBrake() {
        System.out.println("Brake applied in Car");
    }
}
