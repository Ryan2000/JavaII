package com.ryanhoyda.a2shapes;

public class Rectangle extends Shapes {
	
    private double length;
    private double width;

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumference() {
        return 2 * (width + length);
    }
    
    public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
    
    public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

}
