package com.basics;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();
    
    if(age >= 18) {
    	System.out.println("right to vote");
    }else {
    	System.out.println("not eligible");
    }
    sc.close();
	}

}
