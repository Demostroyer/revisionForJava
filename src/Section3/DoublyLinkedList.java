package Section3;

public class DoublyLinkedList<E>{
	
	//Nested node class, similar to singly linked list one, but with prev used 
	private static class Node<E>{
		private E element;
		private Node<E> next;
		private Node<E> prev;//the new previous node in the list
		//constructor for a basic node!
		public Node(E e, Node<E> n, Node<E> p){
			element=e;
			next=n;
			prev=p;
		}
		//some getters & setters
		public E getElement() {return element;}
		public Node<E> getNext(){return next;}
		public Node<E> getPrev(){return prev;}
		public void setNext(Node<E> n) {next=n;}
		public void setPrev(Node<E> n) {prev=n;}
		//end of nested class
	}
	
	//instance vars for DoublyLinkedList
	private int size=0;
	private Node<E> header=null;//the new guards/sentinels
	private Node<E> trailer=null;
	
	//constructor : this is new in comparision to the other constructor in the other linked lists so far
	//needs to make an empty list, but remember an empty list still has the two sentinels/guards
	public DoublyLinkedList() {
		header=new Node<>(null,null,null);
		trailer=new Node<>(null,header,null);
		header.setNext(trailer);
	}
	
	//return number of elements in the list
	
	public int size() {
		return size;
	}
	//tests if the list is empty
	public boolean isEmpty() {
		return size==0;
	}
	//the following two methods get(but do not remove) the head and tail's element of the list
	public E first() {
		if(isEmpty()) {return null;}
		return header.getNext().getElement();//need to get the first node, so use getNext, followed by getElement
	}
	
	public E last() {
		if(isEmpty()) {return null;}
		return trailer.getPrev().getElement();//need to get the last node, use getPrev, then use getElement
	}
	
	//add in an element at the head
	//Node(element, next, previous)
	public void addFirst(E e) {
		Node<E> newest=null;
		//get the old head
		Node<E> oldHead=header.getNext();
		if(isEmpty()){ //so we need to insert between the header and trailer
			 newest = new Node<>(e,trailer,header);//now linked to the header and trailer, just link them to it
			header.setNext(newest);
			trailer.setPrev(newest);
			size++;//increase the size of the list
		}else {//else not empty, so set it between the header and the old head
			newest = new Node<>(e,header.getNext(),header);
			oldHead.setPrev(newest);//setting the old head to be linked to this new head node.
			header.setNext(newest);//dont forget to set header's new next to the new node
			size++;//and also increase size of the list
		}
	}
	//add in an element at the end of the list
	//Node(element, next, previous)
	public void addLast(E e) {
		Node<E> newest=null;
		//get the old tail
		Node<E> oldTail = trailer.getPrev();
		if(isEmpty()) {
			newest=new Node<>(e,trailer,header);
			header.setNext(newest);
			trailer.setPrev(newest);
			size++;
		}else {
			newest = new Node<>(e,trailer,oldTail.getPrev());
			oldTail.setNext(newest);//set the second last node to now link to this new last node
			trailer.setPrev(newest);//set trailer guard to link to this new last node
			size++;
		}
	}
	//this method removes the first element of the list and returns it
	//make a new method called remove that will take the instances were the node to remove is beyond header
	public E removeFirst() {
		if(isEmpty()) {return null;}
		//Node<E> pred = header;//the predessor of the first node is header
		Node<E> succ= header.getNext().getNext();//the successor of the first node is the 2nd node: use 2 getNext()
		Node<E> firstNode= header.getNext();
		header.setNext(succ);//header now points to this successor 
		succ.setPrev(header);//so set successor to point back to previous
		size--;
		return firstNode.getElement();//return the first node's element
	}
	
	public E removeLast() {
		if(isEmpty()) {return null;}
		return remove(trailer.getPrev());
	}
	//private update method, not accessible by other classes
	//removes the given node from the list and returns it
	private E remove(Node<E> node) {
		//these two are needed so we can link it correctly. this was possible above in removeFirst/Last
		Node<E> predecesor = node.getPrev();
		Node<E> successor = node.getNext();
		predecesor.setNext(successor);//now linking the two neighbouring links together
		successor.setPrev(predecesor);
		size--;
		return node.getElement();
	}
}
