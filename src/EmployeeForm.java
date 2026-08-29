
class Employee{
	String name;
	double salary;
	
	Employee(){
		name = "bhuvana";
		salary=50000;
	}
	public Employee(String name ,double salary) {
		this.name=name;
		this.salary = salary;
	}
	public void empDetails(){
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
	}
}
public class EmployeeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
	     e1.empDetails();
	     System.out.println("+++++++++++++++++++");

	     Employee e2 = new Employee("varshitha",200000);
	     e2.empDetails();
	    
	}

}
