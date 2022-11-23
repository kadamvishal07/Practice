package oopsConcepts;

class Animal{
	void eats() {
		System.out.println("Eating...");
	}
}

class Cat extends Animal{
	void meaow() {
		System.out.println("Meaow...");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}

public class InheritanceIsA {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eats();
		c.meaow();
		Dog d = new Dog();
		d.eats();
		d.bark();
		Animal a = new Animal();
		a.eats();
	}

}
