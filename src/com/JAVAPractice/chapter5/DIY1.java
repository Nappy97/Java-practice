package com.JAVAPractice.chapter5;

public class DIY1 {
	int age;
	String Name;
	boolean married;
	int children;
		
	public int getage() {
		return age;
	}
		
	public String getName() {
		return Name;
	}
		
	public boolean getmarried() {
		return married;
	}
		
	public int getchildren() {
		return children;
	}
	public static void main(String[] args) {
		DIY1 personA = new DIY1();
		personA.age = 40;
		personA.Name = "James";
		personA.married = true;
		personA.children = 3;
		
		System.out.println("나이가 " + personA.age + ", 이름이 " + personA.Name + "라는, 남자가 있습니다. 이 남자는 결혼을 " + personA.married + "했고, 아이는 " + personA.children + "명 입니다");
	}

		
		

	}

