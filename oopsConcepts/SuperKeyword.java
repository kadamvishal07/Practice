package oopsConcepts;

class HerbivoresAnimal {
	String color = "White";

	HerbivoresAnimal() {
		System.out.println("Parent class constructor");
	}

	void eat() {
		System.out.println("Eating...");
	}
}

class Lion extends HerbivoresAnimal {
	String color = "Brown";

	Lion() {
		super(); // parent class constructor will always be called even if super is not explicitly used (JVM adds super() implicitly)
		System.out.println("Child class constructor");
	}

	void eat() {
		super.eat(); // calls parent class's eat() function
		System.out.println("Eating small animals...");
	}
	
	void printColor() {
		System.out.println(super.color); // Prints parent class's color value
		System.out.println(color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.eat();
		l1.printColor();
	}

}
