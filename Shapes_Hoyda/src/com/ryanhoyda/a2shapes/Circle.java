package com.ryanhoyda.a2shapes;

public class Circle extends Shapes {

    public static final double PI = 3.1416; //should be Math.PI
    private double radius;
    
    public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
}
