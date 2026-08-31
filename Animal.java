package dailypractice;

public class Animal {
    void sound() {
    	System.out.println("Animal make sound");
    }
    
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog eats chicken");
	}
}
class Main{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
	}
}
