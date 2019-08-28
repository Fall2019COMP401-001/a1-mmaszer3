package a1;

import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in number of customers
		int count = scan.nextInt();
		
		
		/* This section loops through each customer and 
		 * takes in their name and purchases. 
		 */
		for (int i = 0; i < count; i++) {
				
			String first = scan.next();
			String last = scan.next();
		
			int numItems = scan.nextInt();
		
			double total = 0;
			
			/* This loops through the purchases of the current customer 
			 * and takes in the quantity, item name, and price then 
			 * calculates the total cost of purchase.
			 */
			for (int j = 0; j < numItems; j++) {
				int quantity = scan.nextInt();
				String food = scan.next();
				double cost = scan.nextDouble();
			
				cost = quantity * cost;
				
				total = total + cost;
			}	
			
			
			String finalCost = String.format("%.2f", total);
			
			// Print output
			System.out.println(first.charAt(0) + ". " + last + ": " + finalCost);
		}
		// All input parsed, so close scanner
		scan.close();
	}
}
