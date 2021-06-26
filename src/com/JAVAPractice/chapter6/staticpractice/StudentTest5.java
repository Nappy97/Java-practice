package com.JAVAPractice.chapter6.staticpractice;

public class StudentTest5 {
    public static void main(String[] args) {
        Student3 student1 = new Student3();
        System.out.println(student1.serialNum);
        System.out.println(student1.studentCard);
        System.out.println(student1.serialNum + "와" + student1.studentCard);

        Student3 student2 = new Student3();
        System.out.println(student2.serialNum);
        System.out.println(student2.studentCard);
        System.out.println(student2.serialNum+ "와" + student2.studentCard);
    }
}

