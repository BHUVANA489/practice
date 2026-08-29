package com.basics;
class Flower{
	private String name ; 
	private int petals;
	public Flower() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Flower(String name, int petals) {
		super();
		this.name = name;
		this.petals = petals;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPetals() {
		return petals;
	}
	public void setPetals(int petals) {
		this.petals = petals;
	}
	public void greet(String purpose) {
		// TODO Auto-generated method stub
      System.out.println("name:"+name);
      System.out.println("petals:"+petals);
      System.out.println(purpose);
	}
	
}
public class UseFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Flower f = new Flower();
     f.setName("jasmin");
     f.setPetals(6);
     f.greet("to wish");
     System.out.println("=====================");
     Flower f2 = new Flower();
     f2.setName("rose");
     f2.setPetals(13);
     f2.greet("to wish");
     System.out.println("=====================");
     Flower f3 = new Flower();
     f3.setName("lilli");
     f3.setPetals(21);
     f3.greet("to congratulate");
     System.out.println("=====================");
     Flower f4 = new Flower();
     f4.setName("hibiscus");
     f4.setPetals(22);
     f4.greet("for pooja cermony");
     Flower[] allFlowers = {f,f2,f3,f4};
     for(Flower value:allFlowers) {//foreach loop
     System.out.println(value.getName());
     }
	}

}
