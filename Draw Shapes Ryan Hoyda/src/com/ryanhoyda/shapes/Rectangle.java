package com.ryanhoyda.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends BoundedShape{

	public Rectangle() {
		super();
	}

	public Rectangle(int x1, int y1, int x2, int y2, Color theColor, boolean filled) {
		super(x1, y1, x2, y2, theColor, filled);
	}

	@Override
	public void draw(Graphics g) {
	    g.setColor(getTheColor());
        if (isFilled())
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(),
                    getHeight());
        else
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(),
                    getHeight());
		
	}
	
	
	
	

}
