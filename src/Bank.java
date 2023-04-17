/* 
 * @authors: Cristian Herrera and Angie Sanchez
 * 
 * @program: Bank.java
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


public class Bank {

	// Create bank accounts and start of application
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banking_App cristian = new Banking_App("Cristian Herrera", "1");
//		cristian.showMenu();
		
		Banking_App angie = new Banking_App("Angie", "2");
		angie.showMenu();
		
	}

}