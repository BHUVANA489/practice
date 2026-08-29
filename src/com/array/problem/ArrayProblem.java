package com.array.problem;
import java.util.Scanner;
public class ArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++) {
			System.out.println("enter the value of index:"+i+"_");
          arr[i]=sc.nextInt();
		}
//		System.out.println(ages[0]);
//		ages[0]=12;
//		ages[1]=21;
//		ages[2]=19;
//		 System.out.println(ages[3]);
//		 System.out.println("length:"+ages.length);
//		for(int val : arr) {//for each loop
//			System.out.println(val);
//		}
		for(int k : arr)
			System.out.println(k+" ");
	
		}

}
