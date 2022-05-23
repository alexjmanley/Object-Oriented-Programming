package exercise11_1;

import java.util.Scanner; 

public class Execute11_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user 
		System.out.println("Enter three sides of a triangle seperated by a space "
				+ "for example (3.0 2.5 1.0)");
		Triangle Triangle1 = new Triangle(input.nextDouble(), 
				input.nextDouble(), input.nextDouble());
		System.out.println("Enter what color you would like the triangle to be: ");
			Triangle1.setColor(input.next());
		System.out.println("Enter true or false to indicate whether the triangle is filled: ");
			Triangle1.setFilled(input.nextBoolean());
		System.out.println();
		System.out.println("Triangle");
		System.out.println("Area: " + Triangle1.getArea());
		System.out.println("Perimeter: " + Triangle1.getPerimeter());
		System.out.println("Color: " + Triangle1.color());
		System.out.println("Date Created: " + Triangle1.getDateCreated());
		System.out.println("Filled ? " + Triangle1.isFilled());
		
	}

}

class Triangle 
	extends SimpleGeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle(){
		
	}
	Triangle(double newSide1, double newSide2, double newSide3){
		side1 = newSide1; 
		side2 = newSide2;
		side3 = newSide3; 
	}
	public double getSide1() {
		return side1; 
	}
	public double getSide2() {
		return side2; 
	}
	public double getSide3() {
		return side3; 
	}
	public double getArea() {
		double s = (side1 + side2 + side3) / 2; 
		double Area = Math.sqrt(s * (s = side1) * (s - side2) * (s - side3));
		return Area; 
	}
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3; 
		return perimeter; 
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side 2 = " + side2 + " side3 = " + side3; 
	}
}

class SimpleGeometricObject {
	private String color = "white"; 
	private boolean filled; 
	private java.util.Date dateCreated; 
	
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date(); 
	}
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date(); 
		this.color = color; 
		this.filled = filled; 
	}
	public String color() {
		return color; 
	}
	public void setColor(String color) {
		this.color = color; 
	}
	public boolean isFilled() {
		return filled; 
	}
	public void setFilled(boolean filled) {
		this.filled = filled; 
	}
	public java.util.Date getDateCreated() {
		return dateCreated; 
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled; 
	}
}