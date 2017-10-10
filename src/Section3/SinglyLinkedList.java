package Section3;
/**
 * This is my own version of a singly linked list. I will implement my own version of some 
 * premade functions, and also some of my own creation
 * size()-. return size of list
 * isEmpty()-> T/F depennding of if it is
 * first()-> returns but doesnt remove the head element of list
 * last()-> returns but doesnt remove the tail of the list
 * addFirst(e)->adds a new element to the front of the list
 * addLast(e)-> adds a new element to the end of the list
 * removeFirst() -> remmoves the head of the list, returning it
 * If first(), last(), or removeFirst() are called on a list that is empty:
 * return a null reference and leave the list unchanged.
 * @author demps
 * NB: Whilst these links are two pieces of info coupled together 
 * 1:the info(element) being stored in the link
 * 2: the reference to the next node in the list
 * do not forget that the info is the most important part, we never show the user the 2nd part. 
 * @param <E>
 */
public class SinglyLinkedList<E> implements Cloneable {
	//Nested node class
	private static class Node<E>{
		//instance vars of nested class Node
		private E element;//reference to element stored at this node
		private Node<E> next;//ref to next node in the list
		//constructor, E e is the element we are storing, Node <E> n is the next node in the list,
		//the <E> is just a generic style , which says Node n is of some type <E>, can be anything
		public Node(E e, Node <E> n) {
			element=e;//setting instance var element to e
			next=n;//setting instance var next to e
		}
		
		//some getters
		public E getElement() {return element;}
		public Node<E> getNext(){return next;}
		public void setNext(Node <E> n) {next=n;}
	}//end of nested class
	
	//instance vars of the superClass SinglyLinkedList
	private Node<E> head=null;//make a node, type E, setting to null at first
	private Node<E> tail=null; //make the tail node, type E, setting to null. 
	//these two will call the class Node above and make objects of it. 
	private int size=0;//empty at first
	
	//constructor! makes an initially empty list
	public SinglyLinkedList() {
		
	}
	//getter methods
	public int size() {return size;}
	/**
	 * This method will return True if the linked list is empty, false otherwise
	 * 
	 */
	public boolean isEmpty() {return size==0;}//return true if size is 0	
	
	//now to do the method first() and last(), returning the first element but doesnt remove it
	
	public E first() {
		if(isEmpty()) {return null;}//if its empty, return nothing
		return head.getElement();//else return the head 
	}
	
	public E last() {
		if(isEmpty()) {return null;}//if empty, return nothing
		return tail.getElement();//else return the tail
	}
	
	//now going to make the addFirst(), it doesnt return anything
	public void addFirst(E newHead) {//so add the element to the head. 
		//we need to construct a Node with this new element!
		//so this makes the new head , we call node, and pass in newHead as the new element, and head
		//as the next node. 
		head = new Node<>(newHead , head);
		if(size==0) {//if this is the first element, then its also the tail!!
			tail=head;
		}
		size++;//increment size of the list
	}
	
	//now do addLast()
	public void addLast(E newTail) {
		//we need to make a new node with this newtail elem,  
		//dont forget to set next of this new tail to null! then set tail to this element.
		//incrememnt the size.
		Node<E> newest= new Node<>(null,null);//this could be (newTail,null) then wouldnt need following 2 lines
		//these 2 following lines do what the above line does in one!
		newest.element=newTail;//this is setting the attribute directly
		newest.setNext(null);//this is using the created method to set the next node!
		
		if(isEmpty()) {//if the list is empty, then we are also adding the tail!
			head=newest;
		}else {//else it is not empty! => set the old tail to point to the new tail.
			tail.setNext(newest);//set the old tail to the new node
		}
		tail=newest;//set the var tail to ref the new node, therefore tail is now the new node
		size++;//increment
	}
	
	//now creating removeFirst, it returns the node
	public E removeFirst() {
		if(isEmpty()) {return null;}//if empty return nothing
		E answer = head.getElement();//we get the element of type E stored in the head node
		head=head.getNext();//so set the head of the new list to be the next element of the old head
		size -=1;//decrement
		if(isEmpty()) {tail=null;}//just setting the tail to empty is we are now empty.
		return answer;//and just return the removed element.
	}
	
	//create a printing method
	//this starts by printing out the head of the list, it then resets the head, prints it out,
	//moves to the next node, sets head to it and prints, repeat etc. 
	//this is emptying my list?
	public void printSummary() {
		System.out.println(head.getElement());//print the head
		head=head.getNext();//then move onto the next node
	}
	
	//need to crate an addIndex method, that adds in an element at the specified index
	public void addIndex(E newElement, int i) {//takes in the element to add, and its index in the list
		Node<E> newest = new Node<>(newElement, null);//so has element to be added, and null node at first
	//maybe make a temp var, that is not head, that can go through the list ?
		Node<E> temp= head;
		for(int j =size; i<j;j--) {
			//this will move through the list by changing temp(the place we are looking at)
			temp=temp.getNext();
			//so if we are at the correct index, we must set newest's next 
			//to the next var off of the previous one
			if(j==i+1) {
				//so set newest's next to temp's next(so head's next in the untouched list). 
				newest.next=temp.next;
				//and set temp's next to newest
				temp.next=newest;
				
				size++;//increase the size of the list if successful
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
		//creeating inital copy, using Object.clone, with a narrowing cast
		SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone();
		if(size<0) {//if it is a nonempty list, then we must make different heads!
			other.head = new Node<>(head.getElement(),null);
			Node<E> walk = head.getNext();//node we will next set in other, we walk with this node!
			Node<E> otherTail= other.head;//remember the most recent node we created.
			while(walk!=null) {
				Node<E> newest = new Node<>(walk.getElement(),null);//newest node
				otherTail.setNext(newest);//link previous node to this one
				otherTail=newest;//now set it to the current one
				walk=walk.getNext();//move walk to the next node!
			}
		}
		return other;
	}
	
}
