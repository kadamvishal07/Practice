package oopsConcepts;

public class ThisKeyword {

	ThisKeyword(){
		System.out.println("Welcome to ThisKeyword Constructor");
	}
	
	ThisKeyword(int a){
		//System.out.println("a = "+a);
		this(); // Calling default constructor from parameterized constructor. Also, Call to this() must be the first statement in constructor.	
	}
	
	
	
	public static void main(String[] args) {
		ThisKeyword this1 = new ThisKeyword(10);// Calling default constructor from parameterized constructor
	}

}
