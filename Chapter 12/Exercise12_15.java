package exercise;

import java.io.FileNotFoundException;

public class Exercise12_15 {

	public static void main(String[] args) {
		int[] integers = new int[100]; 
		for (int i = 0; i < integers.length; i++)
			integers[i] = (int) (Math.random() * 10);
		java.io.File file = new java.io.File("Exercise12_15.txt");
		try {
			java.io.PrintWriter tofile = new java.io.PrintWriter(file);
			for (int i = 0; i < integers.length; i++)
				tofile.println(Integer.toString(integers[i]));
			tofile.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	try {
		java.util.Scanner input = new java.util.Scanner(file);
		while (input.hasNext()) {
			String number = input.next(); 
			System.out.print(number + " ");
		}
		input.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
