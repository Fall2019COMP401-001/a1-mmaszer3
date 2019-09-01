package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt();
		
		String[] itemNames = new String[numItems];
		double[] itemPrices = new double[numItems];
		int [] itemQuantities = new int[numItems];
		int [] numCustWhoBought = new int[numItems];
		
		/* This loop records the food items and prices
		 * in arrays.
		 */
		for (int i = 0; i < numItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();			
		}
		
		int numCustomers = scan.nextInt();
		
		/* This section loops through the customers, storing the names of 
		 * items they bought and how many in arrays. It also keeps track of
		 * how many customers bought each item.
		 */
		for (int i = 0; i < numCustomers; i++) {
			String first = scan.next();
			String last = scan.next();
			numItems = scan.nextInt();
			
			for (int j = 0; j < numItems; j++) {
				int quantity = scan.nextInt();
				String food = scan.next();
				
				int index = find(itemNames,food);
				itemQuantities[index] = itemQuantities[index] + quantity;
				numCustWhoBought[index] = numCustWhoBought[index] + 1;
			}		
			
		}
		
		// All input parsed, so close scanner
		scan.close();
		
		/* This loops through the array of item names and for each item 
		 * prints out how many customers bought it and how many were bought.
		 */
		for (int i = 0; i < itemNames.length; i++) {
			if (numCustWhoBought[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			}
			else {
				System.out.println(numCustWhoBought[i] + " customers bought " + itemQuantities[i] + " " + itemNames[i]);
			}
		}
		
	}
	
	// This helper method finds the index of a string in an array. Returns -1 if string not found.
	public static int find(String[] a, String target) {
		for (int i = 0; i < a.length; i++)
			if (target.equals(a[i]))
				return i;

		return -1;
	}
}
