package edu.pitt.info_assignment1;

import java.util.Vector;

public class Main {
	public static Vector<Animal> animals = new Vector();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal bird = new Bird("8", "Blue", 20, 10);
		Animal mammal = new Mammal("15", "Brown", 65, 50);
		Animal fish = new Fish("3", "Grey", 5, 3);
		
		animals.addElement(bird);
		animals.addElement(mammal);
		animals.addElement(fish);
		
		animals.get(0).eat();
		animals.get(1).eat();
		animals.get(2).eat();
		
		checkWeight(animals.get(0));
		checkWeight(animals.get(1));
		checkWeight(animals.get(2));
		
		animals.get(0).output();
	}
	
	public static void checkWeight(Animal animal){
		
		if(animal instanceof Bird && animal.getWeight() >= (animal.getMinimumWeight() + 2)){
			((Bird)animal).fly();
		}
		else if(animal instanceof Fish && animal.getWeight() >= (animal.getMinimumWeight() + 1)){
			((Fish)animal).swim();
		}
		else if(animal instanceof Mammal && animal.getWeight() >= (animal.getMinimumWeight() + 1)){
			((Mammal)animal).run();
		}
		
	}

	public static Vector<Animal> getAnimals() {
		return animals;
	}

	public static void setAnimals(Vector<Animal> animals) {
		Main.animals = animals;
	}
	
	

	

}
