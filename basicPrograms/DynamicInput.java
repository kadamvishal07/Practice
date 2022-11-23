package basicPrograms;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many strings? ");
		int n = scan.nextInt();
		String strTotal[] = new String[n];
		scan.nextLine();
		int i = 0;
		while (i < n) {
			System.out.println("Enter string " + i);
			strTotal[i] = scan.nextLine();
			System.out.println("String1 is " + strTotal[i]);
			i++;
		}
		for (int k = 0; k < n; k++) {
			int j = 0;
			String odd = "";
			String even = "";
			while (j < strTotal[k].length()) {
				if (j % 2 == 0) {
					even += strTotal[k].charAt(j);
				} else {
					odd += strTotal[k].charAt(j);
				}
				j++;
			}
			System.out.println("Split Even-Odd split string is: "+even + " " + odd);
		}
		scan.close();

	}

}
