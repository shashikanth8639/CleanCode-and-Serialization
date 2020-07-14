package com.epam.interestCalculator;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
    	
    	System.out.println("Enter the amount:");
        double amount=scanner.nextDouble();
        
        System. out. println("Enter the No.of years:");
        double noOfYears=scanner.nextDouble();
        
        System. out. println("Enter the Rate of  interest");
        double interestRate=scanner.nextDouble();
        
        System.out.println("Enter type of interest \n1)simple_interest\n2)compound_interest\n");
        int choice=scanner.nextInt();
        
        switch(choice) {
	        case 1:SimpleInterest simpleInterest = new SimpleInterest(amount,noOfYears,interestRate);
	        		System.out.println("Simple interest = "+simpleInterest.calculate());
	        		break;
	        		
	        case 2:CompoundInterest  compoundInterest =new CompoundInterest(amount,noOfYears,interestRate);
					System.out.println("compound interest = "+compoundInterest.calculate());
					break;
					
			default:System.out.println("enter valid interest type in range 1 or 2");
					break;
        }
        
        scanner.close();
    }
}
