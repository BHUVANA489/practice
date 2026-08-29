package patternProblems;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int n = 5;
//     for(int i = 1; i<= n;i++) {
//    	 for(int j = 1;j<=i;j++) {
//    		 System.out.print("*");
//    	 }
//    	 System.out.println();
//     
//   int n = 5;
//   for( int i = n;i>=1;i--) {
//	   for(int j = 1;j<=i;j++) {
//		  System.out.print("@"); 
//	   }
//	  System.out.println(); 
//   }
//     int n = 5;
//     for(int i = 1; i<=n;i++) {
//    	 for(int j = 1; j<=n;j++) {
//    		 if(i==1 || i==n||j==1 || j==n) {
//    			 System.out.print("* ");
//    		 }else {
//    			 System.out.print("  ");
//    		 }
//    	 }
//    	 System.out.println();
//     }
//     int n = 4;
//     int space = -1;
//     int star = n+1;
//     for(int row = 1; row<= n ;row++) {
//    	 space++;
//    	 star--;
//    	 
//          for(int k = 1; k<=space;k++) {
//        	 System.out.print("_ ") ; 
//          }
//        	  for(int k = 1; k<=star;k++) {
//              System.out.print("* ");
//          }
//        	  System.out.println();
//        	  
//     }
//     
		//butterfly pattern
//		int n = 3;
//		int star = 0;
//		int space = 2*n-1;
//	for(int rows =1 ; rows<=2*n-1; rows++) {
//		if(rows<=n) {
//			star++;
//			space-=2;
//		}else {
//			star--;
//			space+=2;
//		}
//	
//	 for(int k = 1 ; k<=star;k++) {
//	 System.out.print("* ");	
//	}
//	 for(int k = 1 ; k<=space;k++) {
//			System.out.print("  "
//					+ "");
//		}
//	 for(int k = 1 ; k<=star;k++) {
//		 if(rows==n && k==star)
//		 System.out.print(" ");
//		 else
//			 System.out.print("* ");
//}
//    System.out.println();
//}
//		int n = 4;
//		int val = 0;
//		int space = n;
//		for(int row =1;row<=n;row++) {
//			val++;
//			space--;
//			for(int k = 1; k<=val;k++) {
//				
//				System.out.print(k+" ");
//			}
//			for(int k = 1;k<=space;k++) {
//			System.out.print(" ");
//		}
//			System.out.println();
//	}
//		int n = 4;
//		int val =  n+1;
//		int space = -1;
//		for(int rows = 1; rows<=n; rows++) {
//			val--;
//			space++;
//			 for(int k = 1; k<=val; k++) {
//				 System.out.print(k+" ");
//			 }
//			 for(int k = 1; k<=space;k++) {
//				 System.out.print(" ");
//			 }
//			 System.out.println();
//		}
////	
///number changing pyramid  	
//      	int n = 4;
//		int val = 0;
//		int space = n;
//		
//		for(int rows = 1;rows<=n;rows++) {
//			val++;
//			space--;
//		   	for(int k = 1;k<=val;k++) {
//		   		System.out.print(k+" ");
//		   	     //val++;
//		   	}
//		   
//		   	for(int k = 1;k<=space;k++) {
//		   		System.out.print(" ");
//		   	}
//		   	System.out.println();
//		}
//		int n = 4;
//		int space = n;
//		int val = 1;
//		
//		for(int rows = 1;rows<=n;rows++) {
//		
//			space--;
//		   	for(int k = 1;k<=rows;k++) {
//		   		System.out.print(val+" ");
//		   	     val++;
//		   	}
//		   
//		   	for(int k = 1;k<=space;k++) {
//		   		System.out.print(" ");
//		   	}
//		   	System.out.println();
//		}
		int n = 4;
		//int val = 0;
		for(int i = 1; i<=n ; i++) {
			//val++;
			for(int j = 1; j<=i;j++) {
				if((i + j) % 2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	
		
}
}
