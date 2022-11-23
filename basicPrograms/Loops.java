package basicPrograms;

public class Loops {

	public static void main(String[] args) {
	//if else if
		/*	String address = "Delhi, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		} */

	// Switch Case
		/*int num = 2;
		switch(num)
		{
		case 0: System.out.println("Case 0 executed..."); break;
		case 1: System.out.println("Case 1 executed..."); break;
		case 2: System.out.println("Case 2 executed..."); break;
		default: System.out.println("Default case executed...");
		}*/
		
	// ForLoop	
		/*for(int i=0; i<3; i++) {
			for(int j=100; j<103; j++) {
				System.out.println(i+" "+j);
			}
		}*/
		
	// Labeled ForLoop
		/*aa:
			for(int i=1;i<=3;i++) {
				bb:
				for(int j=1;j<=3;j++) {
					if(i==2&&j==2)
						break;
					System.out.println(i+" "+j);
				}
			}*/
	// ForEach loop
		/*int a[] = {10, 20, 30, 40, 50};
		for(int trace: a)
			System.out.println(trace);
		*/
	// DoWhile loop
		/*int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		*/
	// Continue
		/*for(int i=1;i<=10;i++) {
			if(i==5)
				break;
			System.out.println(i);
		}
		*/
	}

}
