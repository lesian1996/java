
package ATM_program;

import java.util.Scanner;

public class AtmMachine {
	
	private static Scanner in ;
	private static double  balance = 0 ;
	private static int anotherTransaction ;
	
	public static void main(String args[] ) {
		in = new Scanner(System.in) ;
		// call our transaction
		transaction();
	}
	
	private static void transaction() {
		int choice;
		
		System.out.println("Menu:");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance");
		System.out.println("Please select an option");
        choice = in.nextInt();
        
        switch(choice) {
        
        case 1:
        	// withdraw
        	float amount;
        	System.out.println("Please enter amount to withdraw: ");
        	amount = in.nextFloat();
        	if( amount > balance || amount == 0 ) {
        		System.out.println("You have insufficient funds\n\n");
        		anotherTransaction();
        	}
        	else {
        		// they have same cash
        		// update balance
        		balance = balance - amount ;
        		System.out.println("You have withdrawn " + amount + " and your new balance is " + balance + "\n");
        		anotherTransaction();
        	}
        	break;
        	
        case 2:
        	// deposit
        	float deposit ;
        	System.out.println("Please enter amount you would wish to deposit: ");
        	deposit = in.nextFloat();
        	balance = balance + deposit ;
        	System.out.println("You have deposited " + deposit + " and your new balance is " + balance );
        	anotherTransaction();
        	break;
        	
        case 3 :
        	// check balance
        	System.out.println("Your balance is " + balance );
        	anotherTransaction();
        	break;
        	
        default:
        	System.out.println("Invalid option:");
        	anotherTransaction();
        	break;
        }
	}
	
	private static void anotherTransaction() {
		System.out.println("Do you want another transaction? \n"
				+ "Press 1 for another transaction \n 2 To exit");
		anotherTransaction = in.nextInt();
		if(anotherTransaction == 1) {
			transaction();
		}
		else if(anotherTransaction == 2) {
			System.out.println("Thanks for choosing us. Good Bye!");
		}
		else {
			System.out.println("Invalid choice\n");
			anotherTransaction();
		}
	}
}