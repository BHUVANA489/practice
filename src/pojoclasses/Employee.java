package pojoclasses;
//pojo class 
public class Employee {
	
    private int id;
	public String  name;
    protected double salary;
    public Employee(){
    System.out.println("no args are called");
    }
    
    public Employee(int id) {
    	this.id = id;
    	
    }
    public void setId(int id) {
    	this.id=id;
    }
    public int getId() {
    	return id;
    }
    public static void main(String[] args) {
    	Employee e = new Employee();
    	e.setId(101);
    	e.name="bhuvana";
    	e.salary=555555.5;
    	
    	System.out.println(e.getId());
    	System.out.println(e.name);
    	System.out.println(e.salary);
    }

}
