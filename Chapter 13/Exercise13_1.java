package exercise131; 

public class Exercise13_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Please enter the three sides of a triangle seperated by a space"); 
		System.out.println("ex (34 5 6.5)");
		Triangle triangle1 = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		System.out.println("What color is your Triangle?");
		triangle1.setColor(input.next());
		
		System.out.println("Is your Triangle Filled? enter true or false: ");
		triangle1.setFilled(input.nextBoolean());
		
		System.out.println("Triangle");
		System.out.println("Area: " + triangle1.getArea());
		System.out.println("Perimeter: " + triangle1.getPerimeter());
		System.out.println("Color: " + triangle1.getColor());
		System.out.println("Filled: " + triangle1.isFilled());
	}

}

abstract class GeometricObject{
		String color = "white"; 
		boolean filled = false; 
		java.util.Date dateCreated; 
	
	protected GeometricObject() {
		dateCreated = new java.util.Date(); 
	}
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date(); 
		this.color = color; 
		this.filled = filled; 
	}
	public String getColor() {
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
	public abstract double getArea(); 
	public abstract double getPerimeter(); 
}

class Triangle extends GeometricObject{
		double side1 = 0; 
		double side2 = 0; 
		double side3 = 0; 
	
	Triangle(){
	}
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1; 
		this.side2 = side2; 
		this.side3 = side3; 
	}
	public double getSide1() {
		return side1; 
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2; 
	}
	public void setSide2(double side2) {
		this.side2 = side2; 
	}
	public double getSide3() {
		return side3; 
	}
	public void setSide3(double side3) {
		this.side3 = side3; 
	}
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3; 
	}
} 