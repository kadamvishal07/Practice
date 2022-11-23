package basicPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year to check leap year or not: ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		checkLeapYear(year);
		
	}
	
	static void checkLeapYear(int year)
	{
		if ((year%4 == 0 && year%100 != 0 ) || year%400 == 0)
			System.out.println("Year is a leap year");
		else
			System.out.println("Year is not a Leap year");
	}

}
