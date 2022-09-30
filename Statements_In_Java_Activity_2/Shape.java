package com.nil;

public class Shape {
	int numberOfSides;

	// method
	public void calculateShapeArea(int n, int s) {
		switch (n) { // using switch case
		case 1:
			Circle ob1 = new Circle();
			ob1.calculateArea(s);
			break;
		case 2:
			Triangle t = new Triangle();
			t.calculateArea(s);
			break;

		case 3:
			Square s1 = new Square();
			s1.calculateArea(s);
			break;

		default:
			System.out.println("No Shapes Present.");

		}

	}

	public static void main(String[] args) {
		// object
		Shape sp = new Shape();
		sp.calculateShapeArea(1, 12);
		sp.calculateShapeArea(2, 15);
		sp.calculateShapeArea(3, 15);
		sp.calculateShapeArea(4, 11);
	}
}
