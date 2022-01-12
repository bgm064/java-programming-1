package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter 1. name: ");
		String name1 = input.nextLine();
		
		System.out.printf("Enter points: ");
		int points1 = Integer.parseInt(input.nextLine());
		
		System.out.printf("Enter 2. name: ");
		String name2 = input.nextLine();
		
		System.out.printf("Enter points: ");
		int points2 = Integer.parseInt(input.nextLine());
		
		System.out.printf("Enter 3. name: ");
		String name3 = input.nextLine();
		
		System.out.printf("Enter points: ");
		int points3 = Integer.parseInt(input.nextLine());
		
		System.out.printf("Enter 4. name: ");
		String name4 = input.nextLine();
		
		System.out.printf("Enter points: ");
		int points4 = Integer.parseInt(input.nextLine());
		
		Applicant first = new Applicant(name1, points1);
		Applicant second = new Applicant(name2, points2);
		Applicant third = new Applicant(name3, points3);
		Applicant fourth = new Applicant(name4, points4);
		
		ArrayList<Applicant> applicantList = new ArrayList<Applicant>();
		
		applicantList.add(first);
		applicantList.add(second);
		applicantList.add(third);
		applicantList.add(fourth);
		
		System.out.println("");
		System.out.println("Enter the minimum of required points: ");
		int minPoints = Integer.parseInt(input.nextLine());
		
		System.out.println("");
		System.out.println("The following applicants achieved the minimum of " + minPoints + " points:");
		
		for (Applicant applicantObject : applicantList) {
			if (applicantObject.getPoints() >= minPoints) {
			System.out.println(applicantObject.getName() + ", " + applicantObject.getPoints() + " points");
			}
		}
		
	}

}

class Applicant {

	private String name;
	private int points;
	
	public Applicant(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoints() {
		return points;
	}
	
}