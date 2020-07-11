package com.ezycoding.problemsolving.java8features.intrface;

public class Accord implements Honda {
    @Override
    public void showModel() {
        System.out.println("This is Honda Accord.");
    }

    public static void main(String[] args) {
        Honda c = new Accord();
        c.showModel();
        c.changeGear();

        /*
        * Static methods are invoked using the interface where it is defined
        * You can't inherit a static method
        * */
        Car.applyBrake();
        Honda.applyBrake();
    }
}
