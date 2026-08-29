package com.basics;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter number");
     int num = sc.nextInt();
     if( num > 100) {
    	 System.out.println(" out of 100");
     }else {
    	 System.out.println("with in range");
     }
	}

}
