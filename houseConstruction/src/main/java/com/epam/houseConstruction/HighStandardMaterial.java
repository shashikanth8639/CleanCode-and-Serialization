package com.epam.houseConstruction;

public class HighStandardMaterial {
	
	double area;
	
	public HighStandardMaterial(double area) {
		this.area=area;
	}

	public double calculate() {
		return area*1800;
	}
	
}
