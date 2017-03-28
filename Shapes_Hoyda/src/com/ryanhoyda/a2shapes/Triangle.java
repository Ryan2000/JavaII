package com.ryanhoyda.a2shapes;

public class Triangle extends Shapes {

    private double base;
    private double height;
    private double side;
    
	public Triangle(double base, double height, double side) {
		super();
		this.base = base;
		this.height = height;
		this.side = side;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (.5 * (base * height));
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return side * 3;
	}

	
     
	
}
