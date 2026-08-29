package com.basics;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter character");
    char ch = sc.next().charAt(0);
    if(ch == 'a' || ch =='e' || ch == 'i' || ch == '0' || ch == 'u') {
    	System.out.println("vowel");
    }else {
    	System.out.println(" consonent");
    }
	}

}
