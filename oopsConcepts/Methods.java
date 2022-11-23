package oopsConcepts;

import java.util.Scanner;

public class Methods {	
	
	//Static method
	public static void checkEvenOdd(int num) {
		if(num%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd number");
	}

	//Non-Static or Instance method
	int a, b;
	public void addNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Addition of "+a+"+"+b+" is = "+(a+b));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		checkEvenOdd(num); // calling Static method
		
		System.out.println("Enter 2 numbers for additon");
		int a = scan.nextInt();
		int b = scan.nextInt();
		Methods m1 = new Methods(); // calling Instance method 
		m1.addNumbers(a,b);
		
		//calling Accessor and Mutator
		GetterSetter stud1 = new GetterSetter();
		stud1.setRollNo(1);
		stud1.setName("Mark Steven");
		System.out.println(stud1.getRollNo());
		System.out.println(stud1.getName());
		stud1.display();
	}

}

//Accessor and Mutator
class GetterSetter{
	private int rollNo;
	private String name;
	
	public void setRollNo(int rollnumber) {
		rollNo =rollnumber;
	}
	public int getRollNo() {
		return rollNo;		
	}
	public void setName(String studName) {
		name = studName;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println("Roll number is : "+rollNo);
		System.out.println("Name is : "+name);
	}
}
