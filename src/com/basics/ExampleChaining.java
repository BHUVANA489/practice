package com.basics;
class B{
	B(){
		System.out.println("no - arg constructor");
	}
	B(int k ){
		//this();
		System.out.println(k);
	}
	
}

public class ExampleChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B obj2 = new B(7);
    
	}

}
