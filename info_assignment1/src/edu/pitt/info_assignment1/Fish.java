package edu.pitt.info_assignment1;

public class Fish extends Animal {
	
	public Fish(String age, String color, int weight, int minimumWeight){
		super(age, color, "fish", weight, minimumWeight);
	}
	
	public void swim(){
		setWeight(getWeight() - 1);
	}

}
