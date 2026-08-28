package project;

import java.util.Scanner;

public class AnimalController {
	static AnimalRepository animalRepository = new AnimalRepository();
	public static void main(String[] args) {

//show options to user continuously
		//Inside the loop(option 1 , 2,3,4,5)
		Scanner scanner  = new Scanner(System.in);
		
		boolean condition = true;
		while(condition) {
			System.out.println("1.save 2.Get All 3.Get Animal 4.Exit");
			System.out.println("enter choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1 : AnimalController.saveAnimal();
			       break;
			case 2 : AnimalController.getAllAnimal();
			       break;
			case 3 : AnimalController.getAnimal();
		       break;
			case 4 : System.out.println("app is exit");
			condition = false;
		       break;
		       default: System.out.println("Invalid coice");
			}
			}
		
		
	}
	private static void saveAnimal() {
		
     System.out.println("saved");
     Animal animal = null;
     AnimalController.animalRepository.saveAnimal(animal);
     
	}
	private static void getAllAnimal() {
		// TODO Auto-generated method stub
      System.out.println("all animals");
	}
	private static void getAnimal() {
		System.out.println("fav animal");
	}


}
