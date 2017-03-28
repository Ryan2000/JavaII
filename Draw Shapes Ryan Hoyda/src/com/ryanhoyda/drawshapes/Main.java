package com.ryanhoyda.drawshapes;

import javax.swing.JFrame;
import com.ryanhoyda.view.DrawArea;


public class Main {

	public static void main(String[] args) {
		DrawArea application = new DrawArea(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		application.setSize(600, 500);
		application.setVisible(true);
		}
		
	}

