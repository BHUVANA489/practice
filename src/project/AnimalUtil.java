package project;
import java.util.Scanner;

public class AnimalUtil {
      static Scanner scanner = new Scanner(System.in);
		
		public static Kangaroo createAnimal() {

			System.out.println("Enter the animal you want to create");
			
			while(true) {
				System.out.println("Lion, Tiger, Kangaroo");
				
				String animal = scanner.nextLine().trim();
				
				if(animal.equalsIgnoreCase("Lion")) {
					
					return createLion();
				} else if(animal.equalsIgnoreCase("Tiger")) {
					
					return createTiger();
				} else if(animal.equalsIgnoreCase("Kangaroo")) {
					
					return createKangaroo();
				} else {
					System.out.println("Entered wrong animal name");
					
				}
			}
		}

		private static Kangaroo createKangaroo() {
		

			    System.out.print("Enter name:");
			    String name = scanner.nextLine();

			    System.out.print("Enter gender:");
			    String gender = scanner.nextLine();

			    System.out.print("Enter Age:");
			    int age = scanner.nextInt();

			     System.out.print("Enter food type (Herbivore / Carnivore / Omnivore):");
			    String foodType = scanner.nextLine();
			   String food = scanner.nextLine().toLowerCase();
			  switch(food){
			   case "herbivore":
	                System.out.println("Eats plants.");
	                break;

	            case "carnivore":
	                System.out.println("Eats meat.");
	                break;

	            case "omnivore":
	                System.out.println("Eats both plants and meat.");
	                break;

	            default:
	                System.out.println("Invalid food type.");
	        }
			   
			    return new Kangaroo(name, gender, age, foodType);
			}
			
		

		private static Kangaroo createTiger() {
			  System.out.println("Enter name: ");
			    String name = scanner.nextLine();

			    System.out.print("Enter gender: ");
			    String gender = scanner.nextLine();

			    System.out.print("Enter kills: ");
			    int kills = scanner.nextInt();
			    scanner.nextLine();
			    System.out.print("Enter Age:");
				int Age = AnimalUtil.scanner.nextInt();
				System.out.print("Enter Weight:");
				double weight = AnimalUtil.scanner.nextDouble();
				System.out.print("Enter food type (Herbivore / Carnivore / Omnivore):");
			    String foodType = scanner.nextLine();
			    String food = scanner.nextLine().toLowerCase();
				  switch(food){
				   case "herbivore":
		                System.out.println("Eats plants.");
		                break;

		            case "carnivore":
		                System.out.println("Eats meat.");
		                break;

		            case "omnivore":
		                System.out.println("Eats both plants and meat.");
		                break;

		            default:
		                System.out.println("Invalid food type.");
		        }
				   

			    return null;
			
		}

		private static Kangaroo createLion() {

			System.out.print("Enter name: ");
			String name = AnimalUtil.scanner.nextLine();
			System.out.print("Enter gender: ");
			String gender = AnimalUtil.scanner.nextLine();
			System.out.print("Enter kills: ");
			int kills = AnimalUtil.scanner.nextInt();
			System.out.print("Enter Age:");
			int Age = AnimalUtil.scanner.nextInt();
			System.out.print("Enter Weight:");
			double weight = AnimalUtil.scanner.nextDouble();
			System.out.print("Enter food type (Herbivore / Carnivore / Omnivore):");
		    String foodType = scanner.nextLine();
		    String food = scanner.nextLine().toLowerCase();
			  switch(food){
			   case "herbivore":
	                System.out.println("Eats plants.");
	                break;

	            case "carnivore":
	                System.out.println("Eats meat.");
	                break;

	            case "omnivore":
	                System.out.println("Eats both plants and meat.");
	                break;

	            default:
	                System.out.println("Invalid food type.");
	        }
			   
			
			AnimalUtil.scanner.nextLine();
			
			
			return null;
		
	
}
}
