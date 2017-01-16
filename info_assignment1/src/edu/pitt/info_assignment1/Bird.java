package edu.pitt.info_assignment1;

public class Bird extends Animal {
	
	public Bird(String age, String color, int weight, int minimumWeight){
		super(age, color, "bird", weight, minimumWeight);
	}
	
	public void fly(){
		setWeight(getWeight() - 2);
	}

}
