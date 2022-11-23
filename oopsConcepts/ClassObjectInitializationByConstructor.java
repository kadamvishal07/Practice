package oopsConcepts;

class StudentByConstructor{
	int id;
	String name;
	float percentage;
	
	StudentByConstructor(int id, String name, float percentage){
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	protected void displayData() {
		System.out.println(this.id+" "+this.name+" "+this.percentage);
	}
}

public class ClassObjectInitializationByConstructor {

	public static void main(String[] args) {
		StudentByConstructor s1 = new StudentByConstructor(1, "Vishal", 61.50f);
		s1.displayData();
		StudentByConstructor s2 = new StudentByConstructor(2, "Kalpesh", 65.50f);
		s2.displayData();
		StudentByConstructor s3 = new StudentByConstructor(3, "Sridhar", 67.50f);
		s3.displayData();
		StudentByConstructor s4 = new StudentByConstructor(4, "Vikas", 69.50f);
		s4.displayData();
	}

}
