package com.radhika.excercise;

public class LuxuryItem extends Item {
	public LuxuryItem() {
		this.taxRate = 0.09;
	}
	
	public double getCost() {
		return this.getPennies(super.getCost());
	}

}
