FinalProject Vending Machine 

My project uses an interface titled drink that has two methods, a description and drink. Each class titled with a popular drink implements the Drink interface. 
The ExecuteFinalProject class uses ArrayList to create a list for each popular drink class. Using 2 while loops 1 switch statement try catch blocks and if statements. 
a vending machine is created that has the user enter an amount of money, can be out of stock, and can restock. when a drink is chosen from the vending machine the
descritpion and drink methods are activated. 

I built this code to show my skills with java and what I have learned during class.

The files needed to run the code are Drink.java, Coke.java, ExecuteFinalProject.java, Powerade.java, Sprite.java, and Water.java. Put all the files into the same package and run the ExecuteFinalProject.java file. 
[an image of what the program looks like running](FinalProjectSH.png)

This portion of the code I am proud of because I think it shows a wide variaty of skill. 

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
