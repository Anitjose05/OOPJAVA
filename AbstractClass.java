package javalab;
abstract class Shape {
	abstract void numberOfSides();
}
class Rectangle extends Shape {
	int side;
	Rectangle (int side) {
		this.side=side;
	}
	public void numberOfSides() {
		System.out.println("I am Rectangle, No:of sides="+side);
	}
}
class Triangle extends Shape {
	int side;
	Triangle (int side) {
		this.side=side;
	}
	public void numberOfSides() {
		System.out.println("I am Triangle, No:of sides="+side);
	}
}
class Hexagon extends Shape {
	int side;
	Hexagon (int side) {
		this.side=side;
	}
	public void numberOfSides() {
		System.out.println("I am Hexagon, No:of sides="+side);
	}
}
public class AbstractClass {
	public static void main (String args[]) {
		Rectangle r = new Rectangle(4);
		Triangle  t = new Triangle (3);
		Hexagon   h = new Hexagon  (6);
		
		r.numberOfSides ();
		t.numberOfSides ();
		h.numberOfSides ();
	}
}
