/* 
 * @authors: Cristian Herrera and Angie Sanchez
 * 
 * @program: Banking_App.java
 * 
 * @dateCreated: 11/25/2022
 * 
 * Description:
 * 
	This program requirement is a simple banking application that acts as a checking 
	account. It utilizes print statements, if/else statements, strings, ints, methods, 
	loops, and more. Using these JAVA basic concepts, the bank program created 
	allows the user to perform the following multiple functions in the account: 
	
	1. Check your balance 
	2. Make a deposit 
	3. Make a withdrawal 
	4. View the previous transaction 
	5. Calculate Interest 
	6. Exit the application 
	 
	The best way to approach this Exam #3 is to create a simple menu that displays the following options 
	above. 
	
	Use methods to check for the balance of the checking account, Make a deposit, execute a withdrawal, 
	Calculate Interest on deposits in our checking or savings account, and view a “supposed” previous 
	transaction. 
	
	Create sample test data in your code for these transactions. 
 * 
 */
 
import java.util.Scanner;

public class Banking_App {
	
	//creating balance, prev transaction, customer name and ID's
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//creating bank accounts with constructor
	Banking_App(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	//Deposits - if amount does not equal zero adjust balance and prev transaction values
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	// Withdrawals- if amount does not equal zero adjust balance and prev transaction value
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	//Previous transaction
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction); // print deposited transaction
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction)); // print withdrawn transaction
		} else {
			System.out.println("No transaction occurred"); // none to have occured
		}
	}
	
	//Interest Calculator
	void calculateInterest(int years) {
		double interestRate = .077; // set interest rate
		double newBalance = (balance * interestRate * years) + balance; // new balance calculated from interest rate and set year amount
		System.out.println("The current interest rate is " + (100 * interestRate) + "%"); // printing interest rate
		System.out.println("After " + years + " years, you balance will be: " + newBalance); // print new balance after set years
	}
	
	//Console menu
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("Welcome to the AVC banking app. What would you like to do today?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			//Check balance case
			case 'A':
				System.out.println("************************************");
				System.out.println("Balance = $" + balance);
				System.out.println("************************************");
				System.out.println();
				break;
			//Deposit case
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			//Withdrawal case
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
			//Previous transaction case
			case 'D':
				System.out.println("************************************");
				getPreviousTransaction();
				System.out.println("************************************");
				System.out.println();
				break;
			//Interest case
			case 'E':
				System.out.println("Enter how many years of accrued interest: ");
				int years = scanner.nextInt();
				calculateInterest(years);
				break;
			//EXIT
			case 'F':
				System.out.println("************************************");
				break;
			//Invalid input
			default:
				System.out.println("Please enter A, B, C, D, E or F to exit the application.");
				break;
			}
		} while(option != 'F');
		
		//Goodbye and thank you!
		System.out.println("Thank you!");
	}
	
}