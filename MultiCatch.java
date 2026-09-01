package exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(1/1);
		
		String str = "bhuvana";
		System.out.println(str.charAt(1));
		int[] a = new int[2];
		System.out.println(a[2]);
		} catch(ArithmeticException e) {
			System.out.println(e.getClass().getName()+": "+e.getMessage());
			for(Object o : e.getStackTrace()) {
				System.out.println(o);
			}
		}catch(NullPointerException e) {
			System.out.println(e.getClass().getName()+": "+e.getMessage());
			for(Object o : e.getStackTrace()) {
				System.out.println(o);
			}
	}catch(Exception e) {
		System.out.println("exception handling");
	}
		System.out.println("======");
		

	}
}
