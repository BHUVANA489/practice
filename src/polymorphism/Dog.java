package polymorphism;

public class Dog extends Animal {

	 @Override 
	 public void move(){ 
	        
	      // move method from Base class is overriden in this
	      // method
	        System.out.println("Dog is running.");
	    }
	   public void bark(){
	        
	        System.out.println("Dog is barking."); 
	        
	    }
}
