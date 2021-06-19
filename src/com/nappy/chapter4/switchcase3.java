package com.nappy.chapter4;

public class switchcase3 {

	public static void main(String[] args) {
		int floor = 5;
		String name = "type";
		
		switch (floor) {
		case 1: name = "약국";
			break;
		case 2: name = "정형외과";
			break;
		case 3: name = "피부과";
			break;
		case 4: name = "치과";
			break;
		case 5: name = "헬스클럽";
			break;
		}
		System.out.print(floor + "층 ");
		System.out.print(name + "입니다");

	}

}
