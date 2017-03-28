package com.ryanhoyda.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {

	
	public Line() {
		super();
	}

	public Line(int x1, int y1, int x2, int y2, Color theColor) {
		super(x1, y1, x2, y2, theColor);
	}

	@Override //why line doesn't have to be abstract - providing definition
	public void draw(Graphics g) {
		g.setColor(getTheColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
	}
	

}
