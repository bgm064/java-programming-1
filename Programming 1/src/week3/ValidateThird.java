package week3;

import java.util.*;

public class ValidateThird {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    String number = null;
	    int grade = -1;
	

        while (grade < 0 || grade > 5) {

        	
            try {
                System.out.print("Enter grade (0-5): ");
                number = input.nextLine();
                grade = Integer.parseInt(number);
                
                if (grade < 0 || grade > 5) {
                    System.out.println(number + " is not a valid grade.");
                    System.out.print("\n");
                } else {
					System.out.print("OK");
					return;
				}
            } catch (NumberFormatException nfe) {
                System.out.println(number + " is not a valid grade.");
                System.out.print("\n");
            }
    	}
    }
}