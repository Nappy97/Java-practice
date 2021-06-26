package com.JAVAPractice.chapter6.singleton;

public class Car {
    String type;
    int carNum;

    public Car (String type, int carNum){
        this.type =type;
        this.carNum = carNum;
    }

    public int getCarNum(){
        return carNum;
    }

    public void setCarNum(int carNum){
        this.carNum = carNum;
    }
}
