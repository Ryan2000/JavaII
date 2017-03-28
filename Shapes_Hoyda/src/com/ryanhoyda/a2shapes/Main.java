package com.ryanhoyda.a2shapes;

public class Main {


	    public static void main(String [] args){
	        Shapes [] shapes = new Shapes[4];
	        shapes[0] = new Rectangle(100, 200);
	        shapes[1] = new Circle(10);
	        shapes[2] = new Triangle(10, 25, 10);
	        shapes[3] = new Pentagon(35, 80);

	        
	        //Print the area
	        for(int i = 0; i < shapes.length; i++){
	        	System.out.println("Shape = " + shapes[i].getClass().toString());
	            System.out.println("Area = " + shapes[i].area());
	            System.out.println("Circumference = " + shapes[i].circumference());
	            System.out.println("");
	        }
		
	}
	
	

}
