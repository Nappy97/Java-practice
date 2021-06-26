package com.JAVAPractice.chapter6.practicesolve;

public class Q4Person {
    public String personName;
    public int money;

    public Q4Person(String personName, int money){
        this.personName = personName;
        this.money = money;
    }

    public void takeStarbucks(Q4Starbucks starbucks){
        starbucks.take(4000);
        this.money -= 4000;
    }

    public void takeCoffeeBean(Q4CoffeeBean coffeeBean){
        coffeeBean.take(4500);
        this.money -= 4500;
    }

    public void showInfo(){
        System.out.println(personName + "님의 남은 돈은" + money +  "입니다");
    }
}
