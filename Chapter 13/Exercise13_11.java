package exercise1311;

public class Exercise13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
			Octagon octagon1 = new Octagon(5); 
			Octagon octagon2 = (Octagon)octagon1.clone();
			
			System.out.println(octagon1.compareTo(octagon2)); 

	}

}
