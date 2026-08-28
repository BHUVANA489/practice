package MultiArray;

public class MultiArray {
   public static void main(String[] args) {
	   int[][] arr = {{1,2,1},
			   {9,7,2},
			   {7,6,4},
	   };
	   int[][] arr2 = {{2,6,8},
			   {0,1,8},
			   {1,2,4}
		   
	   };
	    int  sum = 0;
	  for(int i = 0; i < arr.length; i++) {
		  for(int j = 0; j< arr[i].length;j++) {
			 System.out.print((arr[i][j]+arr2[i][j])+ " ");
			 
		  }
		  
			System.out.println();
		}
	  }
	   
   }

