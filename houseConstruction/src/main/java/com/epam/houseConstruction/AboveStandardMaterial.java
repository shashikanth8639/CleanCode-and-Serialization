package com.epam.houseConstruction;

public class AboveStandardMaterial {
	
	double area;
			
	public AboveStandardMaterial(double area) {
		this.area=area;
	}

	public double calculate() {
		return area*1500;
	}
	
}
