package com.oop.project1.animal;

public class AnimalController {
	static AnimalReposity animalRepo;
       
	public static void main(String[] args) {
		LionEntity  l1 = new LionEntity();
		l1.setName("Scar Face");
		l1.setKills(203);
		l1.setGender("Male");
		
		LionEntity  l2 = new LionEntity();
		l2.setName("Blayya");
		l2.setKills(1203);
		l2.setGender("Male");
		
	    animalRepo = new AnimalReposity();
	    
	    animalRepo.saveAnimal(l1);
	    animalRepo.saveAnimal(l2);
		
	}
}
