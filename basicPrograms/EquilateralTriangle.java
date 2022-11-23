package basicPrograms;

public class EquilateralTriangle {

	public static void main(String[] args) {
		for (int i=0;i<=2;i++) {
			for(int k=2;k>=i;k--)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
