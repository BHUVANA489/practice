package project;

public class Lion extends Animal {

	@Override
	String getSound() {
		
		return "Lion Roars RRRR";
	}

	@Override
	void Animaldetails() {
		System.out.println("=======Lion=====");
		System.out.println("Name: "+this.getName());
		System.out.println("Legs: "+this.getLegs());
		System.out.println("Gender "+this.getGender());
		System.out.println("Sound: "+this.getSound());
		System.out.println("================");
	}

}
