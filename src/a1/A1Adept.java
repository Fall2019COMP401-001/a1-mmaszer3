package a1;

import java.util.Scanner;

public class A1Adept {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt();
		
		String[] itemNames = new String[numItems];
		double[] itemPrices = new double[numItems];
		
		/* This loop records the food items and prices
		 * in arrays.
		 */
		for (int i = 0; i < numItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();			
		}
		
		int numCustomers = scan.nextInt();
		
		/* This section stores the information of the first customer 
		 * to create a basis of comparison for calculating the highest 
		 * and lowest spender.
		 */
		
		String bigSpenderFirst = scan.next();
		String bigSpenderLast = scan.next();
		
		String littleSpenderFirst = bigSpenderFirst;
		String littleSpenderLast = bigSpenderLast;
		
		int numFirstItems = scan.nextInt();
		
		double maxSpent = 0;
		double minSpent = 0;
		double totalSpent = 0;
		
		for (int i = 0; i < numFirstItems; i++) {
			int firstQuantity = scan.nextInt();
			String firstFood = scan.next();
			
			int index = find(itemNames, firstFood);
			double cost = itemPrices[index] * firstQuantity;
			
			maxSpent = maxSpent + cost;
			minSpent = minSpent + cost;
			totalSpent = totalSpent + cost;
			
		}
		
		/* This section loops through the other customers, calculating their spending 
		 * and comparing it to each other to determine the highest and lowest spender.
		 */
		for (int i = 1; i < numCustomers; i++) {
			String first = scan.next();
			String last = scan.next();
			numItems = scan.nextInt();
			
			double totalOfCust = 0;
			
			for (int j = 0; j < numItems; j++) {
				int quantity = scan.nextInt();
				String food = scan.next();
				
				int index = find(itemNames,food);
				double cost = itemPrices[index] * quantity;
				
				totalOfCust = totalOfCust + cost;
			}		
			
			if (totalOfCust > maxSpent) {
				maxSpent = totalOfCust;
				bigSpenderFirst = first;
				bigSpenderLast = last;
			}
			if (totalOfCust < minSpent) {
				minSpent = totalOfCust;
				littleSpenderFirst = first;
				littleSpenderLast = last;
			}
			
			totalSpent = totalSpent + totalOfCust;
		}
		
		// All input parsed, so close scanner
		scan.close();
		
		String finalMax = String.format("%.2f", maxSpent);
		String finalMin = String.format("%.2f", minSpent);
		String average = String.format("%.2f", totalSpent / numCustomers);
		
		// Print output
		System.out.println("Biggest: " + bigSpenderFirst + " " + bigSpenderLast + " (" + finalMax +")");
		System.out.println("Smallest: " +littleSpenderFirst + " " + littleSpenderLast + " (" + finalMin +")");
		System.out.println("Average: " + average);
		
	}
	
	// This helper method finds the index of a string in an array. Returns -1 if string not found.
	public static int find(String[] a, String target) {
		for (int i = 0; i < a.length; i++)
			if (target.equals(a[i]))
				return i;

		return -1;
	}
}
