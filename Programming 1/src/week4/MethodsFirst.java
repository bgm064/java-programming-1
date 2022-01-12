package week4;

public class MethodsFirst {

	public static void main(String[] args) {
		
		printNumbers(50, 0);

	}
	
	private static void printNumbers(int number, int i) {

		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i +" "); 
			}
		}	
	}

}
