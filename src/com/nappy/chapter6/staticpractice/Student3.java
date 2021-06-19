package com.nappy.chapter6.staticpractice;

public class Student3 {
    public static int serialNum = 1000;
    public int studentCard = serialNum + 100;

    public Student3(){
        serialNum++;
        studentCard++;
    }

}
