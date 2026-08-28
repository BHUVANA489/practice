package polymorphism;

public class Calculations {
    
	public void add(int a,int b) {//method
		
	}
	
	public void add(int x, int y,int Z) {//same add method but different parameters so it is called method overloading
		
	}
	
	public static void main(String[] args) {
		Calculations c = new Calculations();
		c.add(1, 2);
		c.add(2,3,4);
	
	}
}
