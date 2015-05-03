import java.util.ArrayList;

public class MyStack implements Cloneable{
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	//Return if the arraylist is empty or not
	public boolean isEmpty() {
		return list.isEmpty();
	}

	//Return the size
	public int getSize() {
		return list.size();
	}

	//Retrieve the element at the top of the stack without remove it
	public Object peek() {
		return list.get(getSize() - 1);
	}
	
	//Remove the top element from the stack and return it
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	//Add the specified element to the stack
	public void push(Object o) {
		list.add(o);
	}
  
	//Implemented in ArrayList returns a string representation of all the elements in an array list
	@Override /** Override the toString in the Object class */
	public String toString() {
		return "stack: " + list.toString();
	}
	
	//A method to perform a deep copy
	public Object clone(){
		try{
			MyStack mystack1 = (MyStack)super.clone();
			mystack1.list = (ArrayList<Object>)list.clone();
			return mystack1;
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
	}
	
}
