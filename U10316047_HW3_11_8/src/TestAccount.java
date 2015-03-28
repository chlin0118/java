/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業三  11.8
 */
import java.util.ArrayList;

public class TestAccount {

	public static void main(String[] args) {
		
		//Create an Account object
		Account account1 = new Account("George",1122,1000);
		//Invoke the method to set the annual interest rate
		account1.setAnnualInterestRate(1.5);
		
		//Invoke the method to deposit
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);
		
		//Invoke the method to withdraw
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);
		
		//Print the String of account1
		System.out.println(account1.toString());
		
		//Create an ArrayList<Transaction> object and assign the transactions of account1 to it
		ArrayList<Transaction> transaction1 = account1.getTransactions();
		
		//For loop to print every transaction of transaction1
		for(int i = 0;i < transaction1.size();i++){
			Transaction list = transaction1.get(i);
			System.out.println("Transaction:" + (i+1));
			System.out.println("Date: " + list.getDate());
			System.out.println("Type: " + list.getType());
			System.out.println("Amount: " + list.getAmount());
			System.out.println("Balance: " + list.getBalance());
			System.out.println("description: " + list.getDescription());
			System.out.println();
		}

	}

}
