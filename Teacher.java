package encapsulation;

public class Teacher {
  public static void main(String[] args) {
	  Student s = new Student(101);
       //s.isAttended=true;
      //System.out.println("assigned attendence");
	  s.setStudentAttendence(true);
	  s.getStudentAttendence();
  }
}
