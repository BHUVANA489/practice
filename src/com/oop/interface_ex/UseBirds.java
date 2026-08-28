package com.oop.interface_ex;
interface Fly{
	void fly();
}
interface Swim{
	void swim();
}
interface Run{
	void run();
}
class Eagle implements Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Eagle flies above the sky");
		
	}
	
}
class Duck implements Fly , Swim, Run{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Duck runs when its in danger");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Duck swims as a routine");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Duck flies for short distance only");
		
	}
	
}
class Hen implements Fly,Run{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hen runs when it panics");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Hen flies away from danger or to hunt");
		
	}
	
}
public class UseBirds {

	public static void main(String[] args) {
		chooseYourBird("hen");
		chooseYourBird("Duck");

	}
	private static void chooseYourBird(String bird) {
		
		
	}

}
