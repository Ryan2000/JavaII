package com.ryanhoyda.shapes;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;

public class Oval extends BoundedShape{
	
	private int width;
	private int height;
	
	public Oval() {
		super();
	}

	public Oval(final int x1, final int y1, final int x2, final int y2, final int width, final int height, final Color theColor, final boolean filled) {
		super(x1, y1, x2, y2, theColor, filled);
        this.width = width;
        this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setWidth(int x, int y){
	    width = BigDecimal.valueOf(Math.sqrt(Math.pow(y - getY1(), 2) + Math.pow(x - getX1(), 2))).intValue();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setHeight(int x, int y){
		height = BigDecimal.valueOf(Math.sqrt(Math.pow(y - getY1(), 2) + Math.pow(x - getX1(), 2))).intValue();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getTheColor());
        if(isFilled()){
            g.fillOval(getX1(), getY1(), getWidth(), getHeight());
        } else {
            g.drawOval(getX1(), getY1(), getWidth(), getHeight());
        }
	}

	
	
	
}
