package com.epam.designpatterns.decorator;

public class VegFood implements Food {
	
	public double foodPrice() {
		
		return 50.0;
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Veg Food";
	}

}
