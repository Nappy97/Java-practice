package com.nappy.chapter5;

public class DIY2 {
    long orderID;
    String customerID;
    String orderDate;
    String customerName;
    String productNumber;
    String orderAddress;

    public long getorderID() {
        return orderID;
    }

    public String getcustomerID() {
        return customerID;
    }

    public String getorderDate() {
        return orderDate;
    }

    public String getproductNumber() {
        return productNumber;
    }

    public String getcustomerName() {
        return customerName;
    }

    public String getorderAddress() {
        return orderAddress;
    }

    public static void main(String[] args) {
        DIY2 order1 = new DIY2();
        order1.orderID = 201803120001L;
        order1.customerID = "abc123";
        order1.orderDate = "2018.03.12";
        order1.customerName = "홍길순";
        order1.productNumber = "PD03445-12";
        order1.orderAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호 : " + order1.getorderID());
        System.out.println("주문자 아이디 : " + order1.getcustomerID());
        System.out.println("주문 날짜 : " + order1.getorderDate());
        System.out.println("주문자 이름 : " + order1.getcustomerName());
        System.out.println("주문 상품 번호 : " + order1.getproductNumber());
        System.out.println("배송주소: " + order1.getorderAddress());

    }

}
