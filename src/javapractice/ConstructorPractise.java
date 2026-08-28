package javapractice;

public class ConstructorPractise {
	public int i ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ConstructorPractise cp = new ConstructorPractise(77);
		//System.out.println("hello");
		System.out.println(cp.i);
	}
		public ConstructorPractise() {
			//System.out.println("whats the i value");
		 i = 20;
	System.out.println("constructor is called");
	}
		
		public ConstructorPractise(int a) {
			
			i = a;
		}
			

}
