package week4;

public class MethodsFactorial {

	static int factorial(int i, int f, int j) {

			for (i = 1; i <= j; i++) {
				f = f * i;
			}

		return f;
	}

	public static void main(String[] args) {

		int i = 1, f = 1;
		
		for (int j = 1; j <= 9; j++) {

		System.out.printf(j + "! = " + factorial(i, f, j) + "\n");

		}
	}

}
