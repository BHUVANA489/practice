package com.basics;

public class Car {
	private String brand ;
	private int price;
	private boolean Available;
	 
	public Car(String brand) {
		this.brand = brand;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getAvailable() {
		//System.out.println("company is checking availability of car");
		return Available;
	}

	public void setAvailable(boolean flag) {
	      Available = flag;
	     // System.out.println("company updated car available");
	}
    
	

	

}
