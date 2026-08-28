package arraysPractice;

import java.util.Arrays;

public class ArrayAssignment {
  public static void main(String [] args) {
//	  int arr[] = {2,5,3,9,6};
//	 int sum = 0;
//	  for(int i = 0; i<arr.length;i++) {
//		  sum = sum + arr[i];
//	  }
// 
// System.out.println(sum);// sum  of array	
// int average = sum / arr.length;//average of array 
// System.out.println(average);
	  String[] arr1= {"chai","coffee"};
	  String[] arr2= {"milk","water","coke"};
	  String[] merged = new String[arr1.length + arr2.length];
	 // System.out.println(merged);
	  for(int i=0;i<arr1.length;i++) {
		  merged[i] = arr1[i];
	  }
	  for(int i=0;i<arr2.length;i++) {
		  merged[arr1.length+i] = arr2[i];
	  }
	  System.out.println("Merged Array:"+Arrays.toString(merged));
  }
}

