package practiceinterface;

public interface Laptop {
     
	public  void copy();
	
	public void paste();
	
	public void cut();
	
	public void sketch();
	
	public void keyboard();
	
//	public void service();//when adding new rule or method it create error in every file-Error
	
	//here is the implementation of new rule in a business document introduced by javaversion 8
	//when we want to implement use only default or static 
	//in public method we cannot provide implementation
	 default void security() {
		//audio();not an error becoz we can call static variable in non static 
		commonCode();
		System.out.println("Laptop security code");
	}
	
	public static void audio() {
		//security();error becoz we cannot able to call the non static method in static variable
		commonCode();
		System.out.println("Laptop audio code");
	}
	// default and static are introduced in java8
	private  static void commonCode() {
		System.out.println("commoncode");
	}
	//private introduced in java version  9 , here even non static method are accessed in static method
}
// these are the interface provide what to do in a business document 
//generally interface not provide how to do concept untill java version 7