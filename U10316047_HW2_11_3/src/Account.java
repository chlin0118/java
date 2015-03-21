/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業二 11.3
 */
import java.util.Date;

public class Account {
	
	//Declare data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//A no-arg constructor to construct an object whith default value
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//Contructor to construct an object whith specified value
	public Account(int id, double balance){
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
	}
	
	//Deposit money
	public void deposit(double money){
		setBalance(getBalance() + money);
	}
	
	//Return the String about the account
	@Override
	public String toString(){
		return "The balance is " + getBalance() + " ,the monthly interest is " + getMonthlyInterest() 
		+ " and the date when the account was created is " + getDateCreated();
	}
	
	

}
