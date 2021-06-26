package com.JAVAPractice.chapter4;

public class ifExampleDIY {

	public static void main(String[] args) {
		int Score = 50;
		char Grade;

		if (Score >= 90) {
			Grade = 'A';
			System.out.println("잘했어요");
		} else if (Score >= 80 && Score < 90) {
			Grade = 'B';
			System.out.println("아쉬워요");
		} else if (Score >= 70 && Score < 80) {
			Grade = 'C';
			System.out.println("노력하세여");
		} else if (Score >= 60 && Score < 70) {
			Grade = 'D';
			System.out.println("공부좀하세요");
		} else {
			Grade = 'F';
			System.out.println("땡!");

		}
		System.out.println("수고하셨습니다" + Grade + "입니다");

	}
}
