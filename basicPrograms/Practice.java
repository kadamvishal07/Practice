package basicPrograms;

public class Practice {

	public static void main(String[] args) {
		

	}
	int method() {
		try {
			throw new Exception();
			}	
		catch(Exception e) {
			return 2;
		}
		finally {
			return 3;
		}
	}

}
