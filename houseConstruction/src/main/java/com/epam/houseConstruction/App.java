package com.epam.houseConstruction;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	
		Scanner scanner=new Scanner(System.in);
		
    	System.out.println("enter total area");
    	double area=scanner.nextDouble();
        
    	System.out.println("enter type of standard\n1)standard_material\n2)above_standard_material\n3)high_standard\n4)high&fullyautomated");
        int choice=scanner.nextInt();
        
        switch(choice) {
	        case 1:StandardMaterial SM=new StandardMaterial(area);
	        		System.out.println("Simple interest ="+SM.calculate());
	        		break;
	        		
	        case 3:HighStandardMaterial HSM=new HighStandardMaterial(area);
				   System.out.println("Total cost ="+HSM.calculate());
				   break;
	        case 2:AboveStandardMaterial ASM=new AboveStandardMaterial(area);
	 	   		   System.out.println("Total cost ="+ASM.calculate());
	 	   		   break;
	        case 4:HighStandardMaterialFullyAutomated HSMF=new HighStandardMaterialFullyAutomated(area);
				   System.out.println("Total cost ="+HSMF.calculate());
				   break;
			default:System.out.println("enter valid type in range 1 to 4");
					break;
        }
        scanner.close();
    }
}
