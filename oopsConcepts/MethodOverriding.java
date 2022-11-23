package oopsConcepts;

class Bank {
	float getROI() {
		return 0;
	}

	static String sMethod() {
		return "Static Method in Base Class";
	}
}

class ICICI extends Bank {
	float getROI() {
		return 7;
	}

	static String sMethod() {
		return "Static Method in ICICI";
	}
}

class SBI extends Bank {
	float getROI() {
		return 8;
	}
}

class HDFC extends Bank {
	float getROI() {
		return 9;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Bank s = new SBI();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		Bank b = new ICICI();
		// ICICI s1 = new Bank(); - this is not allowed
		System.out.println(s.getROI());
		System.out.println(i.getROI());
		System.out.println(h.getROI());
		System.out.println(b.sMethod()); // It will call base class static method even if instance is of derived class 
	}

}
