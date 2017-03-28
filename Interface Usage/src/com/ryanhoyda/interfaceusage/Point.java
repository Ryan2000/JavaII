package com.ryanhoyda.interfaceusage;

public class Point implements DrawColor {
	
	private int x;
	private int y;
	

	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	@Override
	public void draw(int color) {
		System.out.println("Drawing " + toString() + " with a color of " + color);
	}


    @Override
    public String toString() {
        return new String("X = " + getX() + ", Y = " + getY());
    }

	

}
