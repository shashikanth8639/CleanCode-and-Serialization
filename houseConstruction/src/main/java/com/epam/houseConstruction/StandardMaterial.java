package com.epam.houseConstruction;

public class StandardMaterial {
	
	double area;
	
	public StandardMaterial(double area) {
		this.area=area;
	}

	public double calculate() {
		return area*1200;
	}
}
