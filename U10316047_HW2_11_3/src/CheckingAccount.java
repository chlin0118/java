/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業二 11.3
 */
public class CheckingAccount extends Account{
	
	//Declare data fields
	private double overdraftLimit;
	
	//A no-arg constructor to construct an object whith default value
	public CheckingAccount(){
		super();
	}
	
	//Contructor to construct an object whith specified value
	public CheckingAccount(int id, double balance, double overdraftLimit){
		super(id,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	//Get the overdraftLimit
	public double getOverdraftLimit(){
		return overdraftLimit;
	}
	
	//Set the overdraftLimit
	public void setOverdraftLimit(double overdraftLimit){
		this.overdraftLimit = overdraftLimit;
	}
	
	//Deposit the money
	@Override
	public void deposit(double money){
		super.deposit(money);
	
		if (super.getBalance() < 0){
			System.out.println("You still need to deposit " + (-super.getBalance()) + " more");
		}
	}
	
	//Withdraw the money if the amount isn't over the overdraft limit
	@Override
	public void withdraw(double money){
		if (super.getBalance() < 0){
			System.out.println("You can't withdraw until you deposit enough money");
		}
		else if (money > super.getBalance() + overdraftLimit){
			System.out.println("You can't withdraw over the overdraft limit");
		}
		else if(money > super.getBalance() && money <= super.getBalance() + overdraftLimit){
			super.withdraw(money);
			System.out.println("You withdraw over your balance");
		}
		else{
			super.withdraw(money);
		}
	}
	
	//Return the String about the CheckingAccount
	@Override
	public String toString(){
		return "This is a CheckingAccount. " + super.toString();
	}
	
}
