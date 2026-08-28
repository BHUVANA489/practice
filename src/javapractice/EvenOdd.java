package javapractice;
import java.util.Scanner;
public class EvenOdd {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 //even or odd using if and else statements
	/* System.out.println("whats you number");
	 int num = sc.nextInt();
	 if(num % 2 == 0) {
		 System.out.println(" is even");
	 }else {
		 System.out.println("is odd");
	 }*/
	 //evenorodd code using switch 
	 System.out.println("enter your first number");
	 int a = sc.nextInt();
	 System.out.println("enter your second number");
	 int b = sc.nextInt();
			// int remainder = num % 2;//condition for switch evenodd
	 System.out.println("enter your operation ");
	 char ch = sc.next().charAt(0);
	 
	switch(ch) {
	 case '+':
		 System.out.println("addition="+(a+b));
		 break;
	 case '-' :
		 System.out.println("subtraction="+(a-b));
		 break;
	 case '*' :
		 System.out.println("subtraction="+(a*b));
		 break;
	 case '/' :
		 System.out.println("subtraction="+(a/b));
		 break;
	 default :
		 System.out.println("invalid");
		 break;
	 }
	 sc.close();

 }
}
