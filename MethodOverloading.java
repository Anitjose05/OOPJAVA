package javalab;

import java.util.Scanner;

class Mover{
	void area (double radius) {
		System.out.println("Area of the Circle="+3.14*radius*radius);
	}
	void area (int length,int breadth) {
		System.out.println("Area of the Rectangle="+ length*breadth);
	}
	void area (double base,double height) {
		System.out.println("Area of the Triangle="+(0.5)*base*height);
	}

}
class MethodOverloading {
	public static void main (String args []) {
		Mover mo=new Mover ();
		Scanner sc= new Scanner (System.in) ;
		System.out.println("Enter the radius of the Circle");
		double r=sc.nextDouble();
		mo.area(r);
		System.out.println("Enter the length and breadth of the Rectangle");
		int x =sc.nextInt();
		int y=sc.nextInt();
		mo.area(x, y);
		System.out.println("Enter the base and height of the Triangle");
		double m=sc.nextDouble();
		double n=sc.nextDouble();
		mo.area(m,n);
	}
}