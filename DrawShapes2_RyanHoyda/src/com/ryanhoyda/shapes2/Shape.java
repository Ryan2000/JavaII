package com.ryanhoyda.shapes2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	private int x1, y1, x2, y2;
	private Color theColor;
	
	public Shape(){
	    this(0, 0, 0, 0, Color.BLACK); //Calls the constructor on line 14
	}
	
	public Shape(int x1, int y1, int x2, int y2, Color theColor) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.theColor = theColor;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public Color getTheColor() {
		return theColor;
	}

	public void setTheColor(Color theColor) {
		this.theColor = theColor;
	}
	
	
	public abstract void draw(Graphics g); 
	
}
