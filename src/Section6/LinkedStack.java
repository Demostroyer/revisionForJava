package Section6;

import java.util.Arrays;

import Section3.SinglyLinkedList;//how to access the singllinkedlist class without having to remake it in this package

public class LinkedStack<E> implements Stack<E>{
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	
	public LinkedStack() {}
	//now to use this stack based on a singly linked list!
	public static void main(String[] args) {
		Integer[]a= {1,2,3,4,5};
		String[]s= {"Ian","John","Bryan","Dawid"};
		System.out.println("a="+Arrays.toString(a));
		System.out.println("s="+Arrays.toString(s));
		System.out.println("Reversing..");
		//reverse(a);
		//reverse(s);
		System.out.println("a="+Arrays.toString(a));
		System.out.println("s="+Arrays.toString(s));
	
	}
	
	//the following are the methods in the Stack interface that this class must implement itself!
	public int size() {return list.size();}
	public boolean isEmpty() {return list.isEmpty();}
	public void push(E element) {list.addFirst(element); }//using the SinglyLinkedList method addFirst to add in
	public E pop() {return list.removeFirst();}//using the removeFirst() of singlyLinkedList to get the element
	public E top() {return list.first();}//uses first() of SinglyLinkedList class to get first element
	
	/**a generic method for reversing an array.This method makes use of the stack's LIFO style */
	public static <E> void reverse(E [] a){
		Stack<E> buffer = new ArrayStack<>(a.length);
		for(int i =0; i< a.length;i++) {
			buffer.push(a[i]);//push the contents of the array into the stack
		}
		for(int i=0;i<a.length;i++) {
			a[i]=buffer.pop();//pop the contents off of the stakc, now in reverse order so overwrite the array
		}
	}

}
