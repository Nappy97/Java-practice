package com.nappy.chapter7.PracticeSolve;

public class Q3 {
    public static void main(String[] args) {
        int[] number = new int[5];
        int num = 1;
        int subIndex = 0;

        for (int i = 0; i < 10; i++, num++) {
            if (i % 2 == 0) {
                number[subIndex] = num + 1;
                subIndex++;
            }
        }
        int a = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            a += number[i];


        }System.out.println(a);


    }
}



