package basicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int numbers = 2;
		 int count = 2;
		while(numbers <= 100)
		{
			if (numbers == 2)
			{
				System.out.print(numbers+" ");
			}
			else
			{
				while(count < numbers)
				{
					if ((numbers % count)==0)
						break;
					count++;
				}
				if (count == numbers)
				{
					System.out.print(" "+numbers);
					count = 2;
				}
				else
					count = 2;
			}
			numbers++;
		}
	}

}
