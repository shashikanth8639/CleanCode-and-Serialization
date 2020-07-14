package com.epam.interestCalculator;

public class CompoundInterest {
	
	double amount,noOfYears,interestRate;
	
	public CompoundInterest(double amount, double noOfYears, double interestRate) {
		this.amount=amount;
		this.noOfYears=noOfYears;
		this.interestRate=interestRate;
	}

	public double calculate() {
		return amount * Math.pow(1.0+interestRate/100.0,noOfYears) - amount;
	}
}
