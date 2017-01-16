package edu.pitt.info_assignment1;

public class Mammal extends Animal {
	
	public Mammal(String age, String color, int weight, int minimumWeight){
		super(age, color, "mammal", weight, minimumWeight);
	}
	
	public void run(){
		setWeight(getWeight() - 1);
	}

}
