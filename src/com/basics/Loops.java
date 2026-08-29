package com.basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      for(int i = 0; i<=10;i++) {
//    	  System.out.println(i);
//    	  
//      }
//		int i = 1;
//		while (i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i<=10);
	//}
	char ch1 = 'A';
	char ch2 = 'D';
	int n1 = 1;
	int n2 = 4;
	while(n1<5) {
		System.out.println(""+ch1+n1+ch2+n2);
		ch1++;
		ch2--;
		n1++;
		n2--;
		
	}
	 
	for(int i = 1; i<=100;i++) {
		if(i%2 != 0) {
			System.out.println(i);
		}
	}
	for(int i = 1; i<=10;i++) {
		System.out.println(" 5*"+ i + "=" + (5*i) );
		
	}
	
    int sum = 0;
    for(int i = 1;i<=4;i++) {
    	sum = sum+i;
    }
    System.out.println(sum);
   
    int n= 5;
    int fact = 1;
    for(int i = 1;i<=n;i++) {
        fact = fact*i;
    }
    System.out.println(fact);
    
    int N = 10;
    for(int i = 0;i<N;i++) {
    	System.out.println(i);
    }
    
  
       
}
	
	 
	
}
