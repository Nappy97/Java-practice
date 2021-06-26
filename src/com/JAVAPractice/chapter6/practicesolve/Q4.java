package com.JAVAPractice.chapter6.practicesolve;

public class Q4 {
    public static void main(String[] args) {
        Q4Person personKim = new Q4Person("Kim", 5000);
        Q4Person personLee = new Q4Person("Lee", 6000);

        Q4Starbucks starbucksAmericano = new Q4Starbucks("Americano");
        personKim.takeStarbucks(starbucksAmericano);
        personKim.showInfo();
        starbucksAmericano.showInfo();

        Q4CoffeeBean coffeeBeanLatte = new Q4CoffeeBean("Latte");
        personLee.takeCoffeeBean(coffeeBeanLatte);
        personLee.showInfo();
        coffeeBeanLatte.showInfo();

    }
}
