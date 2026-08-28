package javapractice;

public class ConstructorDemo {
		 public int id;
	     public String name;

	    // Default constructor
	    ConstructorDemo() {
	        id =101;
	        name = "Srija";
	    }

	    // Parameterized constructor
	    ConstructorDemo(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        // Calling default constructor
	        ConstructorDemo obj1 = new ConstructorDemo();

	        System.out.println("Default Constructor:");
	        obj1.display();

	        // Calling parameterized constructor
	        ConstructorDemo obj2 = new ConstructorDemo(102, "Bhuvana");

	        System.out.println("Parameterized Constructor:");
	        obj2.display();
	    }
	}


