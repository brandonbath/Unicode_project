package Deliverable2;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String word1;
		String word2;
		int sum1 = 0;
		int sum2 = 0;

		System.out.println("Enter first word.");
		word1 = scnr.nextLine();

		System.out.println("Enter second word.");
		word2 = scnr.nextLine();
		
		System.out.println();

		for (int i = 0; i < word1.length(); i++) {
			int charValue = (int) word1.charAt(i);
			sum1 = sum1 + charValue;
			System.out.println(word1.charAt(i) + "= " + charValue);
		}

		System.out.println();

		for (int i = 0; i < word2.length(); i++) {
			int charValue = (int) word2.charAt(i);
			sum2 = sum2 + charValue;
			System.out.println(word2.charAt(i) + "= " + charValue);
		}

		int difference = Math.abs(sum1 - sum2);

		System.out.println("Difference (as absolute value): " + difference);

	}
}
