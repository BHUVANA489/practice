package com.basics;

class StudentMemo{
	private String name;
	private float tenth;
	private float inter;
	private static float degree;
	
	public StudentMemo(float tenth) {
		this.tenth =tenth;
}
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTenth() {
		return tenth;
	}

	public void setTenth(float tenth) {
		this.tenth = tenth;
	}

	public float getInter() {
		return inter;
	}

	public void setInter(float inter) {
		this.inter = inter;
	}

	public float getDegree() {
		return degree;
	}

	public void setDegree(float degree) {
		this.degree = degree;
	}



	public static void main(String[] args) {
		Student s = new Student(degree);
	}
		
	}


