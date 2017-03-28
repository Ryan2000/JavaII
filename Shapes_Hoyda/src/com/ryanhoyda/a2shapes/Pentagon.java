package com.ryanhoyda.a2shapes;

public class Pentagon extends Shapes {
	
    private double sideLength;
    private double apothem;
    
    
	public Pentagon(double sideLength, double apothem) {
		super();
		this.sideLength = sideLength;
		this.apothem = apothem;
	}


	public double getSideLength() {
		return sideLength;
	}


	public double getApothem() {
		return apothem;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (5/2) * sideLength * apothem;
	}


	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return sideLength * 5;
	}

    
	
    
}
