package project;

public abstract class Animal {
   private String name;
   private String gender;
   private int legs;
   
   abstract String getSound();
   
   abstract void Animaldetails();
   
   public void eat() {
	   System.out.println("Animal is eating,sleeping,roaming");
   }
   public Animal() {
	   
   }
   public Animal(String name , String gender) {
	   this.name = name;
	   this.gender= gender;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}
@Override
public String toString() {
	return "Animal [name=" + name + ", gender=" + gender + ", legs=" + legs + "]";
}
}
