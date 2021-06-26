package com.JAVAPractice.chapter6;

public class Taxi  {
    int taxiNum;
    int money;

    public Taxi (int taxiNum){
        this.taxiNum = taxiNum;
    }

    public void take (int money) {
        this.money += money;
    }

    public void showInfo(){
        System.out.println("수입은 " + money + "입니다");
    }
}

