package finalf;

import java.util.ArrayList;
import java.util.Scanner; 

public class ExecuteFinalProject {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
		
		
		while (coke.size() > 0 || dietCoke.size() > 0 || sprite.size() > 0 
				|| powerade.size() > 0 || water.size() > 0) {
			System.out.println("Vending Machine Balance: 0"); 
			System.out.println("1. Coke $1.00");
			System.out.println("2. Diet Coke $1.00");
			System.out.println("3. Sprite $1.00");
			System.out.println("4. Powerade $1.50");
			System.out.println("5. Water $.50");
			System.out.println();
			System.out.println("Enter balance amount you would like, ex. 5.00 :");
		double balance = input.nextDouble();
		
		while ((balance > 0) && (coke.size() > 0 || dietCoke.size() > 0 || sprite.size() > 0 
				|| powerade.size() > 0 || water.size() > 0)) {
			System.out.printf("Vending Machine Balance: $%.2f", balance);
			System.out.println();
			System.out.println("1. Coke $1.00");
			System.out.println("2. Diet Coke $1.00");
			System.out.println("3. Sprite $1.00");
			System.out.println("4. Powerade $1.50");
			System.out.println("5. Water $.50");
			System.out.println(); 
			System.out.println("Enter the number of the drink you want: ");
			
		try {
			switch (input.nextInt()) {
			case 1: if ((balance - 1.00) >= 0) {
					System.out.println(coke.get(0).description() + coke.get(0).drink());
					coke.remove(0);
					balance = balance - 1.00;
					break;}
					else 
					System.out.println("Insufficient funds"); break;
			case 2: if ((balance - 1.00) >= 0) {
					System.out.println(dietCoke.get(0).dietDescription() + dietCoke.get(0).drinkDiet());
					dietCoke.remove(0);
					balance = balance - 1.00; 
					break;}
					else 
					System.out.println("Insufficient funds"); break;
			case 3: if ((balance - 1.00) >= 0) {
					System.out.println(sprite.get(0).description() + sprite.get(0).drink());
					sprite.remove(0);
					balance = balance - 1.00;
					break;}
					else 
					System.out.println("Insufficient funds"); break;
			case 4: if ((balance - 1.50) >= 0) {
					System.out.println(powerade.get(0).description() + powerade.get(0).drink());
					powerade.remove(0);
					balance = balance - 1.50;
					break;}
					else 
					System.out.println("Insufficient funds"); break;
			case 5: if ((balance - .50) >= 0) {
					System.out.println(water.get(0).description() + water.get(0).drink());
					water.remove(0);
					balance = balance - .50; 
					break;}
					else 
					System.out.println("Insufficient funds"); break;
				}
			}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Out of stock!");
			}
		finally {
			System.out.println();
				}
			}
		System.out.println("Refund amount: " + balance);
		coke.add(new Coke()); coke.add(new Coke()); coke.add(new Coke());
		dietCoke.add(new Coke()); dietCoke.add(new Coke()); dietCoke.add(new Coke());
		sprite.add(new Sprite()); sprite.add(new Sprite()); sprite.add(new Sprite());
		powerade.add(new Powerade()); powerade.add(new Powerade()); powerade.add(new Powerade());
		water.add(new Water()); water.add(new Water()); water.add(new Water()); 
		System.out.println("Vending machine restocked");
		System.out.println(); 
		}
	}
}
