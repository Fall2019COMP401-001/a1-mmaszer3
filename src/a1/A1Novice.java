package a1;

import java.util.Scanner;
import java.util.ArrayList;

public class A1Novice {
	
	String first;
	
	public A1Novice() {
		first = null;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in number of customers
		int count = scan.nextInt();
		
		
		/*for (int i = 0; i < count; i++) {
				
			
		}
		*/
				
		String first = scan.next();
		String last = scan.next();
		
		int numItems = scan.nextInt();
		
		double total = 0;
		
		for  (int i = 0; i < numItems; i++) {
			int quantity = scan.nextInt();
			String food = scan.next();
			double cost = scan.nextDouble();
			
			cost = quantity * cost;
			
			total = total + cost;
		}
		
		// All input parsed, so close scanner
		scan.close();
			
		// Print output
		System.out.println(first.charAt(0) + ". " + last + ": " + total);

	}
}
