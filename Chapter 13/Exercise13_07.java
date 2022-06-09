package exercise137;

public class Exercise13_07 {

	public static void main(String[] args) {
		
		GeometricObject[] shapes = {new Triangle(12, 13, 14), new Triangle(1, 2, 2), 
									new Triangle (4, 5, 6), new Triangle(8.9, 10, 9),
									new Triangle(45, 46, 47)};
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Triangle " + (i + 1));
			System.out.printf("Area: %2.2f", shapes[i].getArea());
			System.out.println(); 
		if (shapes[i] instanceof Colorable)
			((Colorable)shapes[i]).howToColor();
			System.out.println(); 
		}
		
	}

}
