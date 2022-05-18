package exercise10_07;

import java.util.Date; 
import java.util.Scanner; 

public class Exercise10_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account[] Accounts = {
				new Account(0, 100), new Account(1, 100), new Account(2, 100),
				new Account(3, 100), new Account(4, 100), new Account(5, 100), 
				new Account(6, 100), new Account(7, 100), new Account(8, 100), 
				new Account(9, 100)
				};
		int buzz = 0;
		while(buzz == 0) {
		int id = -1; 
			System.out.println("Enter an id: ");
			id = input.nextInt();
		while (id > 9 || id < 0) {
			System.out.println("Enter a correct id: ");
			id = input.nextInt(); 
			}
		int choice = 0; 
		while (choice != 4) {
			System.out.println("Main menu");
			System.out.println("1: check blance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.println();
			System.out.println("Enter a choice:");
			choice = input.nextInt();
		switch (choice) {
		case 1: System.out.printf("The balance is $%1.2f", Accounts[id].getbalance());
				System.out.println(); break; 
		case 2: System.out.println("Enter an amount to withdraw:"); 
				Accounts[id].withdraw(input.nextDouble()); break; 
		case 3: System.out.println("Enter an amount to deposit");
				Accounts[id].deposit(input.nextDouble()); break;
				}
			}
		  }
		}
}
class Account {
	private int id = 0; 
	private double balance = 0; 
	private double annualInterestRate = 0; 
	private Date dateCreated = new Date();

	Account(){	
	}
	Account(int newid, double newbalance){
		id = newid; 
		balance = newbalance;
	}
	public int getid() {
		return id; 
	}
	public void setid(int newid) {
		id = newid; 
	}
	public double getbalance() {
		return balance; 
	}
	public void setbalance(double newbalance) {
		balance = newbalance;
	}
	public double getannualInterestRate() {
		return annualInterestRate; 
	}
	public void setannualInterestRate(double newannualInterestRate) {
		annualInterestRate = newannualInterestRate; 
	}
	public Date getdateCreated() {
		return dateCreated; 
	}
	public double getMonthlyInterestRate() {
		double MonthlyInterestRate = annualInterestRate / 12;
		return MonthlyInterestRate; 
	}
	public double getMonthlyInterest() {
		double MonthlyInterest = balance * (getMonthlyInterestRate() / 100); 
		return MonthlyInterest; 
	}
	public double withdraw(double withdraw) {
		balance = balance - withdraw; 
		return balance; 
	}
	public double deposit(double deposit) {
		balance = balance + deposit; 
		return balance; 
	}
}