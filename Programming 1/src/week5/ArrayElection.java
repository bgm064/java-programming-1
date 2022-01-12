package week5;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayElection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter the number of candidates: ");
		int candidates = Integer.parseInt(input.nextLine());

		String[] names = new String[candidates];
		int[] votes = new int[candidates];

		for (int i = 0; i < candidates; i++) {
			System.out.printf("Enter " + (i + 1) + ". name: ");
			names[i] = input.nextLine();

			System.out.printf("Enter votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		int[] winner = Arrays.copyOf(votes, votes.length);

		Arrays.sort(winner);

		int j = votes.length - 1;
		int count = 0;
		String outputWin = "";
		String outputTie = "";

		for (int i = 0; i < candidates; i++) {

			if (votes[i] == (winner[j])) {

				outputWin = "The winner is " + names[i] + " with " + votes[i] + " votes!";
				outputTie += names[i] + " (" + votes[i] + " votes) \n";
				count++;
			}

		}

		System.out.println();
		
		if (count <= 1) {
			System.out.println(outputWin);
		} else {
			System.out.println("The election is a tie between the following candidates: \n" + outputTie);
		}

	}

}