package com.ryanhoyda.a3interfaces;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Width = " + getWidth() + ", Height = " + getHeight();
	}


}
