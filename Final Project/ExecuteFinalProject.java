package finalf;

import java.util.ArrayList;
import java.util.Scanner; 

public class ExecuteFinalProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Drink> coke = new ArrayList<>(); 
		coke.add(new Coke()); coke.add(new Coke()); coke.add(new Coke());
		ArrayList<Coke> dietCoke = new ArrayList<>();
		dietCoke.add(new Coke()); dietCoke.add(new Coke()); dietCoke.add(new Coke()); 
		ArrayList<Drink> sprite = new ArrayList<>(); 
		sprite.add(new Sprite()); sprite.add(new Sprite()); sprite.add(new Sprite()); 
		ArrayList<Drink> powerade = new ArrayList<>(); 
		powerade.add(new Powerade()); powerade.add(new Powerade()); powerade.add(new Powerade());
		ArrayList<Drink> water = new ArrayList<>(); 
		water.add(new Water()); water.add(new Water()); water.add(new Water()); 
		
		int i = 1; 
		while (i == 1) {
			System.out.println("Vending Machine");
			System.out.println("1. Coke");
			System.out.println("2. Diet Coke");
			System.out.println("3. Sprite");
			System.out.println("4. Powerade");
			System.out.println("5. Water");
			System.out.println(); 
			System.out.println("Enter the number of the drink you want: ");
			
		try {
			switch (input.nextInt()) {
			case 1: System.out.println(coke.get(0).description() + coke.get(0).drink());
					coke.remove(0);
					break;
			case 2: System.out.println(dietCoke.get(0).dietDescription() + dietCoke.get(0).drinkDiet());
					dietCoke.remove(0);
					break;
			case 3: System.out.println(sprite.get(0).description() + sprite.get(0).drink());
					sprite.remove(0);
					break; 
			case 4: System.out.println(powerade.get(0).description() + powerade.get(0).drink());
					powerade.remove(0);
					break; 
			case 5: System.out.println(water.get(0).description() + water.get(0).drink());
					water.remove(0);
					break; 
				}
			}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Out of order!");
			}
		finally {
			System.out.println();
			}
		}
	}

}
