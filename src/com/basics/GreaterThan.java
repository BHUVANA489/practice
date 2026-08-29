package com.basics;

import java.util.Scanner;

public class GreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    if(num > 10) {
    	System.out.println("greater than 10");
    }else {
    	System.out.println("less than 10");
    }
	}

}
