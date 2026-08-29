package com.array.problem;

public class PushZeroEnd {

	public static void main(String[] args) {
		int [] arr = {1,0,3,0,5,6};
		//op: {1,3,5,6,0,0};
		int non_zero =0;
		for(int i = 0;i<arr.length;i++) {
			//filtering non zeros
			if(arr[i]!=0) {
				arr[non_zero]=arr[i];
				non_zero++;
			}
		}
		//filtering zeros to next position
		while(non_zero<arr.length) {
			arr[non_zero]=0;
			non_zero++;
		}
		//print the array
		for(int k: arr)
		System.out.print(k+" ");

	}

}
