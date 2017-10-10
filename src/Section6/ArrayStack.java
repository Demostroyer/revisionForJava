package Section6;

/**
 *  First implementation of the stack ADT, store elements in an array, named
 * data, with capacity N for some fixed N. Oriented the stack so that the bottom
 * element of the stack is always stored in cell data[0], and the top element of the
 * stack in cell data[t] for index t that is equal to one less than the current size of the
 * stack.
 * @author demps
 * remember that one must implement ALL methods from the interface and give them a body. 
 * The main issue here is that we are working with a fixed size for the array, really limits us.
 * using lists will allow me to have an infinite sized stack!
 */

public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY =1000;//default array capacity
	private E[] data;//our data array of type E
	private int t=-1;//index of the top element in the stack
	public ArrayStack() {this(CAPACITY);}//constructs a stack with default capacity
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];//safe cast 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStack<Integer> myStack = new ArrayStack<Integer>();
		ArrayStack<Integer> stack2 = new ArrayStack<Integer>();
		
		
		myStack.push(10);
		stack2.push(12);
		myStack.push(12);
		myStack.push(12);
		myStack.push(12);
		myStack.push(12);
		myStack.push(12);
		//myStack.push(stack2);
		System.out.println(myStack.top());
		myStack.popAll();
		System.out.println(myStack.top());
		
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return (t+1);
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t==-1);//return true if t is -1
	}

	
	public void push(E e) throws IllegalStateException {
		// TODO Auto-generated method stub
		if(size()==data.length) {
			throw new IllegalStateException("Stack is full");
		}
		data[++t]=e;//increment data before adding in at position t
		
	}

	
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {return null;}//if empty return null
		return data[t];//remember t is our top of the stack
	}
	
	/**
	 * Check if it is empty first!
	 * This method will need to store the current top of the stack in a new var
	 * then change the original data array to the second element.
	 * then return the stored array. 
	 * 
	 */
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {return null;}
		E answer = data[t];//current top of stack to be returned
		
		data[t]=null;//set the old top to null
		t--;//decrement t's value, this will then move back on the stack and point at previous elements of the stack
		
		return data[t];
	}
	public void popAll() {
		if(isEmpty()) {System.out.println("Empty");}
		data[t]=null;
		t--;
		popAll();
	}
}