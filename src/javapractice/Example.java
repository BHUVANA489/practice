package javapractice;
import java.util.Scanner;
public class Example {
  public static void main(String[] args) {
	 /* Scanner sc = new Scanner(System.in);
	  System.out.println("enter");
	  String str = sc.nextLine();
	  String[] words = str.split(" ");
	  System.out.println(words.length);*/
	  
Scanner sc = new Scanner(System.in);
	  System.out.println("enter");
	  String str = sc.nextLine();
	  System.out.println("enter the charcters");
	  char ch=sc.next().charAt(0);
	  int count = 0;
	  for(int i = 0 ; i< str.length();i++) {
		  if(str.charAt(i)==ch) {
			  count++;
		  }
	  }
	  System.out.println("occurences="+count);
	  sc.close();
  }
  
}
