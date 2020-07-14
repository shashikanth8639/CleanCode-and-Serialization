package com.epam.interestCalculator;

public class SimpleInterest {
	
	double amount,noOfYears,interestRate;
	
	public SimpleInterest(double amount, double noOfYears, double interestRate) {
		this.amount=amount;
		this.noOfYears=noOfYears;
		this.interestRate=interestRate;
	}

	public double calculate() {
		return (amount*noOfYears*interestRate)/100;
	}
}
