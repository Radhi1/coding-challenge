package com.radhika.excercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
/*
 Program Author:- Radhika
 */

public class Item {
	protected double taxRate = 0.01;
	private double itemCost;
	
	// Class describing an Item
	public Item() {
		itemCost = 0;
	}
    
	// Class to get item cost
	
	public double getItemCost() {
		return itemCost;
	}
	
	// Class to set item cost

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	// Class to return cost
	
	public double getCost() {
		return itemCost + this.getPennies(itemCost * taxRate);
	}
	
	// Class to return cost in pennies
	
	public double getPennies(double value) {
		BigDecimal bValue = new BigDecimal(value);
		return bValue.setScale(2,RoundingMode.HALF_EVEN).doubleValue();
	}
}
