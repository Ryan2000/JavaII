package com.ryanhoyda.a3interfaces;

public class Main {

	public static void main(String[] args) {

		DrawColor[] drawColors = new DrawColor[] { new Point(100, 100),
                new Rectangle(1, 1, 20, 30) };
		for (int i = 0; i < drawColors.length; i++)
			drawColors[i].draw(DrawColor.BLUE);
			
		FillColor [] fillColor = new FillColor[2];
		for(int i = 0; i < drawColors.length; i++){
		    fillColor[i] = (FillColor) drawColors[i];
		    fillColor[i].fill(FillColor.GREEN);
		}
		
	}

}
