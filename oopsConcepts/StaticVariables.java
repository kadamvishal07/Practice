package oopsConcepts;

public class StaticVariables {

	static int staticNumber = 0; //will get memory only once and retain its value	
	int nonStatisNumber = 0;//will get memory each time when the instance is created  
	
	StaticVariables() {
		staticNumber++;
		nonStatisNumber++;
		System.out.println("StaticNumber "+staticNumber+" NonStaticNumber "+nonStatisNumber);
	}	
	
	public static void main(String[] args) {
		StaticVariables st1= new StaticVariables();
		StaticVariables st2= new StaticVariables();
		StaticVariables st3= new StaticVariables();

	}

}
