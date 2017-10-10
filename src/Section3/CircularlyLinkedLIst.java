package Section3;
/*
 * 
 * remember when using nodes, they take a generic <E> in my own version of the classes
 * in the premade ones, I can use this <E> or tell the List/hasmap/tree that is of a certain type!
 */

public class CircularlyLinkedLIst<E> {
	
	//nested node class
	private static class Node<E>{
		//instance vars
		private E element;//element can be type E
		private Node<E> next;//next is of type Node<E>
		//now a constructor
		public Node(E e, Node <E> n) {
			element=e;
			next=n;
		}
		//some getters
		public E getElement() {return element;}
		public Node<E> getNext(){return next;}
		public void setNext(Node<E> n) {next=n;}
		
	}//end of nested class
	
	//private vars of this CircularlInked class
	private Node<E> tail=null;
	private int size=0;
	//constructor
	public CircularlyLinkedLIst() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CircularlyLinkedLIst<Object> cList = new CircularlyLinkedLIst<Object>();
			
			cList.addFirst("1 addfirst used");
			cList.addLast("2 addlast used");
			System.out.println("currently first: "+cList.first());//calling the first function to see what is first in my circular list
			System.out.println("currently last: "+cList.last());
			cList.addFirst("3 addfirst");
			System.out.println("now this is first: "+cList.first());//should be "another head"
			cList.addFirst("4 addfirst");
			System.out.println("now this is first: "+cList.first());//should be "another head"
			//now try my version of removeFirst()
			System.out.println("Removefirst returns this element: "+cList.removeFirst());
			//My own version of it works! yes! it works for empty lists, and single nodes lists
			//now print out it again
			System.out.println("after removal this is first: "+cList.first());//hopefully now it is different!
			System.out.println("after removal this is last: "+cList.last());
			
	}
	
	//access methods : size and isEmpty are ALWAYS in it
	public int size() {return size;}
	public boolean isEmpty() {return size==0;}
	public E first() {
		if(isEmpty()) {return null;}
		return tail.getNext().getElement();//this is chaining method calls, so tail's next ref(head) element
		
	}
	
	public E last() {
		if(isEmpty()) {return null;}
		return tail.getElement();//else return tails element
	}
	
	//update methods, start with the new rotate method
	public void rotate() {
		if(tail!=null) {//if tail is empty we would do nothing, but if it is non-empty
			tail=tail.getNext();//then set it to the next node
		}	
	}
	
	//altered addFirst
	public void addFirst(E e) {
		
		if(size==0) {//if the list empty.
			tail = new Node<>(e,null);//then this new node is the tail(implicitly the head)
			tail.setNext(tail);//so set the tail's next to itself , as it is a single node!
		}else {//link to itself
			//create a new node, where its element is e, and its next ref is the tail's old next
			Node<E> newThing = new Node<>(e,tail.getNext());
			tail.setNext(newThing);//setting tail's new next to new Node!
		}
		size++;//we increase the size of the list.
	}
	
	//altered addLast
	//no need for checks of size==0 here as addFirst does that for me
	public void addLast(E e) {
			addFirst(e);//insert new element at the head of the list
			tail=tail.getNext();//then update the references so this new element becomes the tail
	}
	
	//altered removeFirst()
	//this will return the element, and remove it from the list!
	//My own version of it works! yes! it works for empty lists, and single nodes lists
	//lots of ways to do this, the book has a different way too. but the main idea is the same!
	//we create a temp head var, which stores the reference to the head var by using tail.getNext()
	//we then just bypass this by setting tail's next to be the next node after this temp head var. 
	//and we return this temp head var's element. 
	public E removeFirst() {
		if(isEmpty()) {return null;}//it is empty
		//get the next var for tail, used when bypassing the 'head'
		//head: set it's element to be the "head's" element, the next is set to the next of the 'head'
		//newHead: element is temp's next node's element, and the next is the following node.
		//note: there are two ways to the above described, either be direclt calling it part of the Node constuctor
		//or by simply using .getNext()
		Node<E> head= tail.getNext();//new Node<>(tail.getNext().getElement(),tail.getNext().getNext());
		Node<E> newHead=tail.getNext().getNext();//new Node<>(head.getNext().getElement(),head.getNext());//this is the new head!
		
		//we set the tail to bypass the 'head'
		tail.setNext(newHead);//bypass the current head
		size--;//decrement the size of the list
		return head.getElement();//return the temp head's element
	}	
}
