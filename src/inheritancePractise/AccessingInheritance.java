package inheritancePractise;

public class AccessingInheritance {

	public static void main(String[] args) {
     GrandFather gf = new GrandFather();
     gf.property();
	
	Father f = new Father();
	f.Land();
	f.property();
	
	Child ch = new Child();
	ch.property();
	ch.Land();
	ch.deserve();
	}
}
