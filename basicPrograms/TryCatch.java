package basicPrograms;

public class TryCatch {
	
	public static int test() {
		try {
			int a = 10/0;
			return 1;
		}catch(Exception ex) {
			return 2;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.print(test());

	}

}
