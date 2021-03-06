package exercise;

import java.util.Date;

public class Execute {

	public static void main(String[] args) {
		Account Account1 = new Account(); 
		CheckingAccount Account2 = new CheckingAccount(); 
		SavingsAccount Account3 = new SavingsAccount(); 
		System.out.println(Account1.toString());
		System.out.println(Account2.toString());
		System.out.println(Account3.toString());
	}

}

class Account {
		int id = 0; 
		double balance = 0; 
		double annualInterestRate = 0; 
		Date dateCreated = new Date();

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

class CheckingAccount
	extends Account{
	double overdraft = -500; 
	CheckingAccount(){
		
		}
	CheckingAccount(double newoverdraft){
		overdraft = newoverdraft; 
	}
	CheckingAccount(double newoverdraft, int newid, double newbalance){
		id = newid; 
		balance = newbalance; 
		overdraft = newoverdraft; 
		}
	public double withdraw(double withdraw) {
		if((balance - withdraw) < overdraft)
			return balance - withdraw;
		else 
			return balance; 
	}
}
class SavingsAccount
	extends Account{
	SavingsAccount(){
		
	}
	SavingsAccount(int newid, double newbalance){
		id = newid; 
		balance = newbalance; 
	}
	public double withdraw(double withdraw) {
		if((balance - withdraw) < 0)
			return balance; 
		else 
			return balance - withdraw; 
	}
}