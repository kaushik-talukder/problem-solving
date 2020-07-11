package com.ezycoding.problemsolving.java8features.iface;

public interface Hybrid extends Honda, Ford {

    /*
    * There is a conflict with default while inheriting from multiple interfaces.
    * So it has to define its own default to hide parent methods
    * */
    @Override
    default void changeGear() {
        System.out.println("Gear changed in Hybrid.");
    }
}
