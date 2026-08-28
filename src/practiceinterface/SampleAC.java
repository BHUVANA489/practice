package practiceinterface;

public abstract class SampleAC implements Laptop{

  public void copy() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo copy code");
	}

	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo paste code");
	}


	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo cut code");
	}


	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo keyboard code");
	}
	//abstract method - unimplemented 
	public abstract  void sketch();
	
	//abstract method declare cheyali implementation kosam annapudu we use abstract keyword
 
	
}
