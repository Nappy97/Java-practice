package com.JAVAPractice.chapter8.witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<com.JAVAPractice.chapter8.witharraylist.Customer> customerList = new ArrayList<com.JAVAPractice.chapter8.witharraylist.Customer>();

        com.JAVAPractice.chapter8.witharraylist.Customer customerLee = new com.JAVAPractice.chapter8.witharraylist.Customer(10010, "이순신");
        com.JAVAPractice.chapter8.witharraylist.Customer customerShin = new com.JAVAPractice.chapter8.witharraylist.Customer(10020, "신사임당");
        GoldCustomer customerHong = new GoldCustomer(10030, "홍길동");
        GoldCustomer customerYoul = new GoldCustomer(10040, " 이율곡");
        com.JAVAPractice.chapter8.witharraylist.VIPCustomer customerKim = new VIPCustomer(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        /*customerList.add(customerHong);
        customerList.add(customerYoul);*/
        customerList.add(customerKim);

        System.out.println("========고객 정보 출력 ========");
        for (com.JAVAPractice.chapter8.witharraylist.Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("==============할인율과 보너스 포인트 계산-======");
        int price = 10000;
        for(Customer customer : customerList){
            int cost = customer.calePrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다");
        }
    }
}
