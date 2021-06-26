package com.JAVAPractice.chapter6.practicesolve;

public class Q4CoffeeBean {
    String coffeeType;
    int money;
    int customerCount;

    public Q4CoffeeBean(String coffeeType){
        this.coffeeType = coffeeType;
    }

    public void take (int money){
        this.money += money;
        customerCount++;
    }

    public void showInfo(){
        System.out.println(coffeeType + "을 주문하셨고" + " 수입은 " + money + "이며, 고객 수는 " + customerCount + "입니다");
    }
}
