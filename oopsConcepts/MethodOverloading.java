package oopsConcepts;

class Adder{
	static int addInt(int a, int b) {
		return (a+b);
	}
	static double addDouble(double a, double b) {
		return (a+b);
	}
	static String addString(String a, String b) {
		return (a+b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.addInt(10, 20));
		System.out.println(Adder.addDouble(100000, 200000));
		System.out.println(Adder.addString("Vishal", "Kadam"));
	}
}
