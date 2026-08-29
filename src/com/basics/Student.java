package com.basics;

public class Student {
	//int age = 20;//non static field 
	static int age = 13;
	 
	public Student(float degree) {
		
	}

	
	public static void main(String[] args) {
	
//Student student = new Student();
//System.out.println(student.age);
     //  System.out.println(age);
		int age = 18;//local variable		
		System.out.println(age);
	teacher("Sandhya ",2264 ," English");
	teacher("arun", 2265 ," java");//parameterised varible
	}

	private static void teacher(String name, int id, String sub ) {
	
		System.out.println(name + id + sub);
		
		
	}

}
