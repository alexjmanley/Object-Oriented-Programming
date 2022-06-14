package finalproject;

import java.util.ArrayList;
import java.util.Scanner; 

public class ExecuteFinalProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Drink> coke = new ArrayList<>(); 
		coke.add(new Coke()); coke.add(new Coke()); coke.add(new Coke());
		ArrayList<Drink> dietCoke = new ArrayList<>();
		dietCoke.add(new Coke()); dietCoke.add(new Coke()); dietCoke.add(new Coke()); 
		ArrayList<Drink> sprite = new ArrayList<>(); 
		sprite.add(new Sprite()); sprite.add(new Sprite()); sprite.add(new Sprite()); 
		ArrayList<Drink> powerade = new ArrayList<>(); 
		powerade.add(new Powerade()); powerade.add(new Powerade()); powerade.add(new Powerade());
		ArrayList<Drink> water = new ArrayList<>(); 
		water.add(new Water()); water.add(new Water()); water.add(new Water()); 
		
			System.out.println("Vending Machine");
			System.out.println("1. Coke");
			System.out.println("2. Diet Coke");
			System.out.println("3. Sprite");
			System.out.println("4. Powerade");
			System.out.println("5. Water");
			System.out.println(); 
			System.out.println("Enter the number of the drink you want: ");
			
			
			
	}

}
