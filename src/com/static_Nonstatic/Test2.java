package com.static_Nonstatic;

public class Test2 {
	static int number;
	static {
		//static block
		System.out.println("static block");
		number=10;
	}
	
	{
		//non static block
		System.out.println("non static block");
	}

	public Test2() {
		System.out.println("constructor");
		

	}
	public static void main(String[] args) {
		System.out.println("main method");
		Test2 t1 =new Test2();
		System.out.println(t1.number);
//	System.out.println(Test1.number);
//	Test1.print();
//	Test1 t1 = new Test1();
//	t1.print2();
	}

}
