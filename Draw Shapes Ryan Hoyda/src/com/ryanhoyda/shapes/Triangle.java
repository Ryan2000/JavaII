package com.ryanhoyda.shapes;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends BoundedShape{
	
	private int x3, y3;
	
	public Triangle() {
		super();
	}

	public Triangle(final int x1, final int y1, final int x2, final int y2, final int x3, final int y3, final Color color, final boolean filled) {
        super(x1, y1, x2, y2, color, filled);
        this.x3 = x3;
        this.y3 = y3;
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

	@Override
	public void draw(final Graphics g) {
		g.setColor(getTheColor());
        if(isFilled()){
            g.fillPolygon(new int[]{getX1(), getX2(), getX3()}, 
                            new int[]{getY1(), getY2(), getY3()}, 3);
        } else {
            g.drawPolygon(new int[]{getX1(), getX2(), getX3()}, 
                            new int[]{getY1(), getY2(), getY3()}, 3);
        }
    }
		
		
}
	
	
	
	
	


