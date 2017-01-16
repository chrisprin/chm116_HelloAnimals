package edu.pitt.info_assignment1;

public class Animal {
	
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	public Animal(String age, String color, String type, int weight, int minimumWeight){
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	public void eat(){
		setWeight(getWeight() + 1);
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMinimumWeight() {
		return minimumWeight;
	}

	public void setMinimumWeight(int minimumWeight) {
		this.minimumWeight = minimumWeight;
	}

	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public void output(){
		for(int i=0; i<3; i++){
			System.out.print(Main.animals.get(i).age + ", " + Main.animals.get(i).color + ", " + Main.animals.get(i).type + ", " + Main.animals.get(i).weight + ", " + Main.animals.get(i).minimumWeight);
			System.out.println();
		}
	}

}
