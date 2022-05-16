package exercise9_7;

import java.util.Date; 

public class Exercise09_07 {

	public static void main(String[] args) {
		Account Account1 = new Account(1122, 20000);
		Account1.setannualInterestRate(4.5);
		Account1.withdraw(2500);
		Account1.deposit(3000);
		System.out.println("Account 1:");
		System.out.printf("Balance: %2.2f", Account1.getbalance());
		System.out.println(); 
		System.out.printf("Monthly interest: %2.2f", Account1.getMonthlyInterest());
		System.out.println();
		System.out.println("Date Created: " + Account1.getdateCreated());
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