package com.cognizant.shapes;

import com.nil.Circle;
import com.nil.Square;
import com.nil.Triangle;

public class Shapes {
	int numberOfSides;

	// method
	public void calculateShapeArea(int n, int s) {
		if (n == 1) { // 1st condition
			Circle c = new Circle();
			c.calculateArea(s);
		} else if (n == 3) { // 2nd condition
			Triangle t = new Triangle();
			t.calculateArea(s);
		} else if (n == 4) { // 3rd condition
			Square s1 = new Square();
			s1.calculateArea(s);
		} else { // 4th condition
			System.out.println("no shape present");
		}
	}

	public static void main(String[] args) {
		// object
		Shapes sp = new Shapes();
		sp.calculateShapeArea(1, 2);
		sp.calculateShapeArea(3, 2);
		sp.calculateShapeArea(4, 2);
		sp.calculateShapeArea(6, 2);

	}

}
