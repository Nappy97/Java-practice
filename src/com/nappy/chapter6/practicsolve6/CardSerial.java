package com.nappy.chapter6.practicsolve6;

public class CardSerial {
    public static void main(String[] args) {
        CardCompany customerKim = new CardCompany();
        customerKim.setCustomerName("Kim");
        System.out.println(customerKim.serialNum);
        System.out.println(customerKim.CustomerName + "카드번호: " + customerKim.cardNum);

        CardCompany customerLee = new CardCompany();
        customerLee.setCustomerName("Lee");
        System.out.println(customerLee.serialNum);
        System.out.println(customerLee.CustomerName + "카드번호: " + customerLee.cardNum);

    }
}
