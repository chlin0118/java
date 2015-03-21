/**
 * Name:林家弘
 * ID: U10316047
 * Ex: 作業二 11.3
 */
public class test {

	public static void main(String[] args) {
		
		//Create the objects
		Account account1 = new Account(1122,20000);
		CheckingAccount checkingaccount1 = new  CheckingAccount(1123,20000,10000);
		SavingsAccount savingsaccount1 = new SavingsAccount(1124,20000);
		
		//Invoke the mutator to set the AnnualInterestRate
		account1.setAnnualInterestRate(4.5);
		checkingaccount1.setAnnualInterestRate(4.5);
		savingsaccount1.setAnnualInterestRate(4.5);
		
		//Print the String with invoke the toString method
		System.out.println(account1.toString());
		System.out.println(checkingaccount1.toString());
		System.out.println(savingsaccount1.toString());
		
	}

}
