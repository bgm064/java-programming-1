package week3;

import java.util.*;

public class ValidateSecond {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    String number;
	    int grade = -1;

        while (grade < 0 || grade > 5) {

            try {
                System.out.print("Enter grade (0-5): ");
                number = input.nextLine();
                grade = Integer.parseInt(number);
                
                if (grade < 0 || grade > 5) {
                    System.out.println("Please enter an integer between 0 and 5.");
                    return;
                } else {
					System.out.print("OK");
				}
            } catch (NumberFormatException nfe) {   
                System.out.println("Please enter an integer between 0 and 5.");
                return;
            }
    	}
    }
}