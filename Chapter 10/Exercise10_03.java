package exercise10_3;

public class Exercise10_03 {

	public static void main(String[] args) {
		MyInteger number = new MyInteger(123);
		System.out.println(number);
		System.out.println("What is the number: " + number.getvalue());
		System.out.println("Even ? " + number.isEven());
		System.out.println("Odd? " + number.isOdd());
		System.out.println("Prime? " + number.isPrime());
		System.out.println("is 12 even? " + number.isEven(12));
		System.out.println("is 12 odd? " + number.isOdd(12));
		System.out.println("is 12 Prime? " + number.isPrime(12));
		System.out.println("back to the number is it even? " + number.isEven(123));
		System.out.println("is it odd? " + number.isOdd(123));
		System.out.println("is it Prime? " + number.isPrime(123));
		System.out.println("Is the number equal to 12? " + number.equals(12));
		System.out.println("Is 12 equal to 12? " + number.equals(number));
		System.out.println("Testing parseInt(char[]) number used 1234 " + number.parseInt(new char[] {'1', '2', '3', '4'}));
		System.out.println("Testing parseInt(String) number used 1234 " + number.parseInt("1234"));
		}
}
class MyInteger{
		int value; 
	
	MyInteger(int newvalue){
		value = newvalue; 
	}
	public int getvalue() {
		return value; 
	}
	public boolean isEven() {
		if (value % 2 == 0)
			return true; 
		else 
			return false; 
	}
	public boolean isOdd() {
		if (!(value % 2 == 0))
			return true; 
		else 
			return false; 
	}
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
			return true; 
	}
	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true; 
		else 
			return false; 	
	}
	public static boolean isOdd(int value) {
		if (!(value % 2 == 0))
			return true; 
		else 
			return false; 
	}
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
			return true; 
	}
	public static boolean isEven(MyInteger value) {
		int val = value.getvalue();
		return isEven(val);
	}
	public static boolean isOdd(MyInteger value) {
		int val = value.getvalue();
		return isOdd(val);
	}
	public static boolean isPrime(MyInteger value) {
		int val = value.getvalue();
		return isPrime(val);
	}
	public boolean equals(int newvalue) {
		if (value == newvalue)
			return true; 
		else 
			return false; 
	}
	public boolean equals(MyInteger newvalue) {
		int val = newvalue.getvalue();
		return equals(val); 
	}
	public static int parseInt(char[] num) {
		int number = Integer.parseInt(String.valueOf(num));
		return number; 
	}
	public static int parseInt(String num) {
		int number = Integer.valueOf(num);
		return number; 
	}
}
