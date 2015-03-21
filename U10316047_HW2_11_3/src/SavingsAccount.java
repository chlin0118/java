/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業二 11.3
 */
public class SavingsAccount extends Account{
	
	//A no-arg constructor to construct an object whith default value
	public SavingsAccount(){
		super();
	}
	
	//Contructor to construct an object whith specified value
	public SavingsAccount(int id, double balance){
		super(id,balance);
	}
	
	//Withdraw the money if the amount isn't over the balance
	@Override
	public void withdraw(double money){
		if (money > super.getBalance()){
			System.out.println("You can't overdraw. ");
		}
		else {
			super.withdraw(money);
		}
	}
	
	//Return the String about the SavingsAccount
	@Override
	public String toString(){
		return "This is a SavingsAccount. " + super.toString();
	}
}
