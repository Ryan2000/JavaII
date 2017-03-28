package com.ryanhoyda.shapes;

public class Rectangle extends Shape {
	
    private double length;
    private double width;
	
    @Override   //must override or error
    public double area() {
        return length * width;
    }

    @Override  //must override or error
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
