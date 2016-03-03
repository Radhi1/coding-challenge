package com.radhika.excercise;

import java.util.Scanner;
/*
 This program is to calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. 
 The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. 
 For simplicity of implementation, all transactions are measured in cents (pennies).
 */
/*
 Program Author:- Radhika
 */
public class Application {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		double initialPrice = -1.0;
		String luxuryStatusInput = "";
/*
 Put Input cost
 If Input invalid put another input
 */
		
		do {
			System.out
					.println("Please input the price of an item as an integer/floating point number with two decimals:");
			initialPrice = parseCostInput(scan.nextLine());
		} while (initialPrice == -1.0);

		//Get luxury status input 
		//If the input is an invalid response either yes or no (case sensitive)
		do {
			System.out.println("Please input 'yes' for a luxury item:");
			luxuryStatusInput = scan.nextLine();
		} while (!(luxuryStatusInput.toLowerCase().matches("yes") || luxuryStatusInput.toLowerCase()
				.matches("no")));
		
		if(parseLuxuryStatus(luxuryStatusInput)) {
			LuxuryItem lItem = new LuxuryItem();
			lItem.setItemCost(initialPrice);
			System.out.println("Item cost is: "
					+ lItem.getCost());
		} else {
			Item lItem = new Item();
			lItem.setItemCost(initialPrice);
			System.out.println("Item cost is: "
					+ lItem.getCost());
		}
		
		

	}
	
	//* @param parseCostInput
	public static double parseCostInput(String costInput) {

		if (costInput.matches("\\d+\\.\\d")
				|| costInput.matches("\\d+\\.\\d\\d")
				|| costInput.matches("\\d+")) {
			return Double.parseDouble(costInput);
		}
		return -1.0;
	}
	
	//Return the boolean value isLuxuryInput
	public static Boolean parseLuxuryStatus(String lInput) {

		if (lInput.toLowerCase().matches("yes")) {
			return true;
		}
		return false;
	}

}
