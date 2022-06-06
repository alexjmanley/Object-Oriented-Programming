package exercise12_3;

import java.util.Scanner; 

public class Exercise12_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[100]; 
		for (int i = 0; i < list.length; i++)
			list[i] = (int) (Math.random() * 10);
		
		System.out.println("Enter an index of the Array: ");
		
		try {
			System.out.println("The value of the selected index is " + list[input.nextInt()]);
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}

}
