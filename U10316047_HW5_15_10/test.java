
import java.util.Scanner;

public class test{
	public static void main(String[] args){
		//Declare a variable
		String string1;
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Create a MyStack  object
		MyStack mystack1 = new MyStack();
		
		//For loop to prompt user to enter 5 strings and invoke push method to add them to mystack1
		for(int i=0;i<5;i++){
			System.out.println("Enter Mystack1 String " + (i+1));
			string1 = input.next();
			mystack1.push(string1);
		}
		//Create a MyStack object (mystack2) use the deep copy of mystack1
		MyStack mystack2 = (MyStack)mystack1.clone();
		
		//For loop to prompt user to enter 5 strings and invoke push method to add them to mystack2
		for(int i=0;i<5;i++){
			System.out.println("Enter Mystack2 String " + (i+1));
			string1 = input.next();
			mystack2.push(string1);
		}
		
		
		
		System.out.println("\nMystack1 reverse order:");
		
		//While mystack1 isn't empty, invoke pop method to print the element and remove it
		while (!mystack1.isEmpty()){
			System.out.println(mystack1.pop());
		}
		
		System.out.println("\nMystack2 reverse order:");
		
		//While mystack2 isn't empty, invoke pop method to print the element and remove it
		while (!mystack2.isEmpty()){
			System.out.println(mystack2.pop());
		}
		
		

	}
}
