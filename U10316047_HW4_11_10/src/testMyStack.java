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
		
		
		while (!mystack1.isEmpty()){
			System.out.println(mystack1.pop());
		}
	}
}

class MyStack extends ArrayList<Object>{

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return super.size();
	}

	public Object peek() {
		return super.get(getSize() - 1);
	}
	
	public Object pop() {
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		super.add(o);
	}
  
	@Override /** Override the toString in the Object class */
	public String toString() {
		return "stack: " + super.toString();
	}
}