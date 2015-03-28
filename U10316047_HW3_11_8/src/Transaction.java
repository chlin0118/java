/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業三  11.8
 */
import java.util.Date;

public class Transaction{
	//Declare data fields
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//Contructor to construct an object whith specified value
	public Transaction(char type, double amount, double balance, String description) {
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	//Get the date
	public Date getDate() {
		return date;
	}
	
	//Get the type
	public char getType() {
		return type;
	}

	//Get the amount
	public double getAmount() {
		return amount;
	}
	
	//Get the balance
	public double getBalance() {
		return balance;
	}
	
	//Get the description
	public String getDescription() {
		return description;
	}
}