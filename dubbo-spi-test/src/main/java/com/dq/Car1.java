package com.dq;

public class Car1 implements Car {

    public Car1(){
        System.out.println("Car1()");
    }

    @Override
    public void drive() {
        System.out.println("car1() drive");
    }
}
