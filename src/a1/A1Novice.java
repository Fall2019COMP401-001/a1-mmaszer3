package a1;

import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in number of customers
		// int count = scan.nextInt();
		
		// Create an array to store customer info.
		
		 /*int[] custInfo = new int[count];
		
		
		for (int i = 0; i < count; i++) {
				
			
		}
		*/
		
		double total = 0;
		
		String first = scan.nextLine();
		String last = scan.nextLine();
		int numItems = scan.nextInt();
		
		
		for (int i = 0; i < numItems; i++) {
			scan.nextInt();
			scan.nextLine();
			double cost = scan.nextInt();
			total = total + cost;
		}
		
		// All input parsed, so close scanner
		scan.close();
		
		System.out.println(first.charAt(0) + ". " + last + ": " + total);
		
	}
}
