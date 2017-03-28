package com.ryanhoyda.shapes2;

import java.awt.Color;
import com.ryanhoyda.shapes2.Shape;

public abstract class BoundedShape extends Shape{
	
	private boolean filled;
	private int x3, y3;

	
	public BoundedShape(){
	    this.filled = false;
	}
	
	public BoundedShape(int x1, int y1, int x2, int y2, int x3, int y3, Color theColor, boolean filled) {
		super(x1, y1, x2, y2, theColor);
		this.filled = filled;
		this.x3 = x3;
		this.y3 = y3;

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

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}
	

}

