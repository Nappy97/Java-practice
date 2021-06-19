package com.nappy.chapter7.array;

public class DIYTwoDimension {
    public static void main(String[] args) {
        String[][] arr = {{"ab","cd"},{"ef","gh"},{"ij","kl"},{"mn","op"},{"qr","st"},{"uv","wx"},{"yz"}};

        for (int i=0; i< arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.println(arr [i][j]);
            }
            System.out.println();
        }
    }
}
