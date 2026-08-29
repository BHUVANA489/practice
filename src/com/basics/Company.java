package com.basics;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c = new Car("BMW");
   // c.brand="GM";
     c.setAvailable(true);
     c.setPrice(10000000);
     
     System.out.println(c.getBrand());
     System.out.println(c.getPrice());
     System.out.println(c.getAvailable());
	}

}
