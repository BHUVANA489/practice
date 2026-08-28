package exceptionhandling;

public class Program1 {
	/*
	 * stacktrace
	 * exception name- java.lang.ArithmeticException:
	 * exception message -/ by zero
	 * exception in which line number-20
	 * methods info
	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub
      System.out.println("program execution starts");
      int fNumber = 9;
      int sNumber = 0;
      int result = 0;
      
      try {
      result = fNumber/sNumber;
      }
      catch(ArithmeticException ae) {
    	  System.out.println(ae.toString());//write a logic to enter this message into log unit
    	  throw ae;
      }
      finally {
    	 System.out.println("finally hammaya"); 
      }
      
      System.out.println("output is "+ result);
      System.out.println("program excecution ends");
	
	}   
}
