package project;

public class Kangaroo {
	
	    private String name;
	    private String gender;
	    private int age;
	    private String foodType;

	    public Kangaroo(String name, String gender,int age, String foodType) {
	        this.name = name;
	        this.gender = gender;
	        this.age=age;
	        this.foodType = foodType;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getGender() {
	        return gender;
	    }

	   

	    public String getFoodType() {
	        return foodType;
	    }

	    @Override
	    public String toString() {
	        return "Kangaroo{" +
	                "name='" + name + '\'' +
	                ", gender='" + gender + '\'' +
	                
	                ", foodType='" + foodType + '\'' +
	                '}';
	    }
	}
    
