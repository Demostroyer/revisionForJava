package Section3;

public class myDoublyLinked {

	public static void main(String[] args) {
		DoublyLinkedList<Object> dList=new DoublyLinkedList<Object>();//a doubly linked list
		
		dList.addFirst(1);
		System.out.println("First element is: "+dList.first());
		System.out.println("Element at the end of the list is: " + dList.last());
		System.out.println("Adding in a new element");
		dList.addLast(2);
		System.out.println("New element added to end of the list: " + dList.last() );
		System.out.println("Removing an element at the head of the list");
		System.out.println("Removed element at the head of the list : "+dList.removeFirst());
		System.out.println("Removing the last element of the list");
		System.out.println("Element removed from the end of the list: " + dList.removeLast());
		System.out.println("Size of the list after removals "+dList.size());
		System.out.println("Adding in a few new elements");
		
		dList.addFirst(1);
		dList.addFirst(2);
		dList.addFirst(3);
		dList.addFirst(4);
		System.out.println("First element is now : "+dList.first());
		System.out.println("Last element is now : " + dList.last());
		System.out.println("Removing the last element of the list");
		Object removed = dList.removeLast();
		System.out.println("Element removed was: "+removed);
		System.out.println("The last element after removal should now be 2 : " + dList.last());
		
		
	}
}
