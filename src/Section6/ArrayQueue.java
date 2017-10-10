package Section6;

public class ArrayQueue<E> implements Queue<E> {
	//instance variables
	private E[] data;//generic array used for storage
	private int f=0;//index of the front element
	private int sz =0;//current number of elements
	
	public static final int CAP=100;
	
	//constructors
	public ArrayQueue() {this(CAP);}
	public ArrayQueue(int capacity) {
		data =(E[]) new Object[capacity];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//now to test this out!
		//this ArayQueue ONLY accepts integers onto the stack!
		ArrayQueue<Integer> myArrQ = new ArrayQueue<Integer>();
		//This one though can accept ANY type
		ArrayQueue<Integer> myArrQ1 = new ArrayQueue<Integer>();
		//myArrQ1.enqueue("hello");
		myArrQ.enqueue(1);
		System.out.println(myArrQ.dequeue());
		
	}
	
	//methods
	public int size() {return sz;}
	
	public boolean isEmpty() {return sz==0;}
	/**
	 * This method will add an element to the queue at the back of it.
	 */
	public void enqueue(E e) throws IllegalStateException{
		if(isEmpty()) {data[0]=e;}
		if(sz==data.length) throw new IllegalStateException("Queue is full.");
		//perform the modulo arithmetic to move the queue around the array
		int avail=(f+sz) %data.length;//this will find the next place available to put in an element. 
		data[avail]=e;
		sz++;
	}
	
	public E first() {
		if(isEmpty()) {return null;}
		return data[f];
	}
	/**This method will take the element at the head of the queue off and return it.*/
	public E dequeue() {
		if(isEmpty()) {return null;}
		E answer =data[f];//store the head of the queue in a new temp 
		data[f]=null;//set the old head position to null
		f=(f+1) % data.length;//find the new head of the queue
		sz--;//decrease the size of the queue
		return answer;
	}
	


}
