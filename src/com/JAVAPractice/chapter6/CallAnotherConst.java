package com.JAVAPractice.chapter6;

 class Person1{
    String name;
    int age;

    Person1(){
        this ("이름없음", 1);
    }
    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);
    }
}
