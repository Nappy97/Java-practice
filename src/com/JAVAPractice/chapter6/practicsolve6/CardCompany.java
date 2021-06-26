package com.JAVAPractice.chapter6.practicsolve6;

public class CardCompany {
    public static int serialNum = 100000;
    public int cardNum;
    public String CustomerName;

    public CardCompany(){
        serialNum++;
        cardNum = serialNum;
    }

    public String getCustomerName(){
        return CustomerName;
    }

    public void setCustomerName(String name){
        CustomerName = name;
    }
}
