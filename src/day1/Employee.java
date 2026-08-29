package day1;

public class Employee {

	    int id;
	    String name;
	    double salary;

	    // Default constructor
	    Employee() {
	        id = 0;
	        name = "Anitha";
	        salary = 0.0;
	    }

	    // Parameterized constructor
	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    void displayDetails() {

	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	        System.out.println("--------------------------");
	    }

	    public static void main(String[] args) {

	        // Using parameterized constructor
	        Employee employee1 =
	                new Employee(101, "Anshitha", 50000.0);

	        Employee employee2 =
	                new Employee(102, "blessy", 60000.0);

	        employee1.displayDetails();
	        employee2.displayDetails();
	    }
	}

