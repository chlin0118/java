import java.util.ArrayList;
import java.util.Scanner;

public class testMyStack{
	public static void main(String[] args){
		//Declare a variable
		String string1;
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Create MyStack Scanner object
		MyStack mystack1 = new MyStack();
		
		//For loop to prompt user to enter 5 strings and invoke push method to add them to mystack1
		for(int i=0;i<5;i++){
			System.out.println("Enter a String:");
			string1 = input.next();
			mystack1.push(string1);
		}
		
		
		System.out.println("\nReverse order:");
		
		//While mystack1 isn't empty, invoke pop method to print the element and remove it
		while (!mystack1.isEmpty()){
			System.out.println(mystack1.pop());
		}
		
		input.close();
	}
}

class MyStack extends ArrayList<Object>{
	
	//Return if the arraylist is empty or not
	public boolean isEmpty() {
		return super.isEmpty();
	}

	//Return the size
	public int getSize() {
		return super.size();
	}

	//Retrieve the element at the top of the stack without remove it
	public Object peek() {
		return super.get(getSize() - 1);
	}
	
	//Remove the top element from the stack and return it
	public Object pop() {
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}

	//Add the specified element to the stack
	public void push(Object o) {
		super.add(o);
	}
  
	//Implemented in ArrayList returns a string representation of all the elements in an array list
	@Override /** Override the toString in the Object class */
	public String toString() {
		return "stack: " + super.toString();
	}
}