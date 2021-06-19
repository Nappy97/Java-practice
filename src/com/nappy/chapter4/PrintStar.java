package com.nappy.chapter4;

public class PrintStar {
    public static void main(String[] args) {
        int a =1;
        int b = 3;

        for (int i = 0; i <7; i++) {
            if(i<3) {
                for (int j = 0; j>b; j++) {
                    System.out.print(" ");
                }
                for (int j = a; j<0; j--) {
                    System.out.print("*");
                }
                for (int j = 0; j>b; j++) {
                    System.out.print(" ");
                }
                System.out.println();

            }else {
                for(int j=b; j<0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j > b; j++) {
                    System.out.print("*");
                }
                for (int j= b; j<0; j--) {
                    System.out.print(" ");
                }
                System.out.println();

            }
        }
    }
}