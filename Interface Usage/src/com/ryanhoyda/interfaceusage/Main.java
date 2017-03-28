package com.ryanhoyda.interfaceusage;

public class Main {

	public static void main(String[] args) {
		DrawColor[] drawColors = new DrawColor[] { new Point(100, 100),
                new Rectangle(1, 1, 20, 30) };
		for (int i = 0; i < drawColors.length; i++)
			drawColors[i].draw(DrawColor.BLUE);
		
	}

}
