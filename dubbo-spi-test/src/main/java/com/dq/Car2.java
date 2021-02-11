package com.dq;

public class Car2 implements Car {

    public Car2(){
        System.out.println("Car2()");
    }

    @Override
    public void drive() {
        System.out.println("car2() drive");
    }
}
