package com.nappy.chapter3;

public class Operation5 {

	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num <<2);
		System.out.println(num >>2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num <<2;
		System.out.println(num);

	}

}
