package com.ryanhoyda.shapes;

public class Main {

	public static void main(String[] args) {

		 Circle aCircle = new Circle(2.0);
	        System.out.println("Area for aCircle = " + aCircle.area());
	        System.out.println("Circumference for aCircle = " + aCircle.circumference());

	        Rectangle aRectangle = new Rectangle(2.0, 4.0);
	        System.out.println("\nArea for aRectangle = " + aRectangle.area());
	        System.out.println("Circumference for aRectangle = " + aRectangle.circumference());
	}

}
