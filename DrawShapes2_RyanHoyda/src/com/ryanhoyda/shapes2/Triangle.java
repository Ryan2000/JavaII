package com.ryanhoyda.shapes2;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("unused")
public class Triangle extends BoundedShape{
	
    public Triangle() {
		super();
	}

    public Triangle(final int x1, final int y1, final int x2, final int y2, final int x3, final int y3, final Color color, final boolean filled) {
        super(x1, y1, x2, y2, x3, y3, color, filled);
    }

    @Override
    public void draw(final Graphics g) {
    	g.setColor(getTheColor());
        if(isFilled()){
            g.fillPolygon(new int[]{getX1(), getX2(), getX3()}, new int[]{getY1(), getY2(), getY3()}, 3);
        } else {
            g.drawPolygon(new int[]{getX1(), getX2(), getX3()}, new int[]{getY1(), getY2(), getY3()}, 3);
        }
    }
}
	
