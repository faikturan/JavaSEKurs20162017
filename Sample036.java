package com.faikturan;

import java.util.Scanner;

public class Sample036 {

	public static void main(String[] args) {
		// Compare String
		String s1, s2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		s1 = in.nextLine();
		
		System.out.println("Enter the second string");
		s2 = in.nextLine();
		
		if(s1.equals(s2))
			System.out.println("Both Strings are equal.");
		else
			System.out.println("Strings are unequal");
		
	}

}
