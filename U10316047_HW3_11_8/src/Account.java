/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業三  11.8
 */
import java.util.ArrayList;
import java.util.Date;

public class Account {
	
	//Declare data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	//A no-arg constructor to construct an object whith default value
	public Account(){
		name = "";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	

	//Contructor to construct an object whith specified value
	public Account(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//Set the id
	public void setId(int id){
		this.id = id;
	}
	
	//Set the balance
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	//set the annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	//set the name
	public void setName(String name){
		this.name = name;
	}
	
	//Get the id
	public int getId(){
		return id;
	}
	
	//Get the balance
	public double getBalance(){
		return balance;
	}
	
	//Get the annualInterestRate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//Get the dateCreated
	public Date getDateCreated(){
		return dateCreated;
	}
	
	//Get the name
	public String getName(){
		return name;
	}
	
	//Get the transactions
	public ArrayList<Transaction> getTransactions(){
		return transactions;
	}
	
	//Get the Monthly InterestRate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12 ;
	}
	
	//Get the Monthly Interest
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate()/100) ;
	}
	
	//Withdraw money
	public void withdraw(double money){
		setBalance(getBalance() - money);
		transactions.add(new Transaction('W', money, getBalance(), ""));
	}
	
	//Deposit money
	public void deposit(double money){
		setBalance(getBalance() + money);
		transactions.add(new Transaction('D', money, getBalance(), ""));
	}
	
	//Return the String about the account
	@Override
	public String toString(){
		return "The name is " + getName() + "\nThe id is " + getId() + "\nThe annual interestRate is " + getAnnualInterestRate() + "%\nThe balance is " 
		+ getBalance() + "\nThe monthly interest is " + getMonthlyInterest()+ "\nThe date when the account was created is " + getDateCreated() + "\n";
	}
}
