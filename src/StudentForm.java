
class Student{
	int rollNo;
	String name;
	int age;
	String gender;
	
	Student(){
		rollNo = 22610562;
		name = "bhuvana";
		age= 22;
		gender="Female";
	}
	
	public  void studentDetails() {
		System.out.println("roll num: "+rollNo);
		System.out.println("name: "+this.name);
		System.out.println("Gender: "+this.gender);
		System.out.println("age: "+age);


	}
}
public class StudentForm {
	public static void main(String[] args) {
		
		Student s1 = new Student();
	    s1.studentDetails();
	    System.out.println("===================");
		
		Student s2 = new Student();
		s2.rollNo = 2;
		s2.name= "sri";
		s2.age=21;
		s2.gender= "Female";
	}

}
