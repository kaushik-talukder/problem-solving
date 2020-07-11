package com.ezycoding.problemsolving.java8features.intrface;

public interface Honda extends Car {
    void showModel();
    /*
    * Default methods have to have body.
    * Default methods can be inherited.
    * If same method name is used in parent and child interface, child interface hides the parent method
    * */
    default void changeGear() {
        System.out.println("Gear changed in Honda");
    }

    /*
    * Static methods have to have body
    * Can't be inherited
    * */
    static void applyBrake() {
        System.out.println("Brake applied in Honda");
    }
}
