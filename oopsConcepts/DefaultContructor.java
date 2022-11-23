package oopsConcepts;

public class DefaultContructor {
	int id;
	String name;
	//Default constructor will be created to assign 0 or null values for the properties of class
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		DefaultContructor c1 = new DefaultContructor();
		c1.display();

	}

}
