package com.abhishek.facade;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {

		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
