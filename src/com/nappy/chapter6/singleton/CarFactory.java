package com.nappy.chapter6.singleton;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    public static CarFactory getInstance(){
        if (instance == null){
            instance = new CarFactory();
        }
        return instance;
    }
    private static  int serialNum = 10000;

    public Car createCar(){
        Car car1 = new Car("Sonata", serialNum);
        serialNum++;
        return car1;
    }
}
