package com.nappy.chapter2;

public class implicitconversion {

	public static void main(String[] args) {
		byte bNUM = 10;
		int iNUM = bNUM;
		
		System.out.println(bNUM);
		System.out.println(iNUM);
		
		int iNUM2 = 20;
		float fNUM = iNUM2;
		
		System.out.println(iNUM2);
		System.out.println(fNUM);
		
		double dNUM;
		dNUM = fNUM+iNUM;
		System.out.println(dNUM);

	}

}
