package com.ryanhoyda.shapes;

import java.awt.Color;

public abstract class BoundedShape extends Shape{
	
	private boolean filled;

	
	public BoundedShape(){
	    this.filled = false;
	}
	
	public BoundedShape(int x1, int y1, int x2, int y2, Color theColor, boolean filled) {
		super(x1, y1, x2, y2, theColor);
		this.filled = filled;

	}
	
	public boolean isFilled() {
        return filled;
    }

    public void setFilled(final boolean filled) {
        this.filled = filled;
    }
	
    public int getUpperLeftX() {
        return Math.min(getX1(), getX2());
    }

    public int getUpperLeftY() {
        return Math.min(getY1(), getY2());
    }

    public int getWidth() {
        return Math.abs(getX2() - getX1());
    }

    public int getHeight() {
        return Math.abs(getY2() - getY1());
    }
	


}
