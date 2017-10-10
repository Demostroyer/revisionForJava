package Section3;


public class mySingleList {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//create a singlylinkedlist
		SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
		int[] a= {1,2,3};
		//now create some new nodes! will use strings , ints, arrays anything one could want.
		list.addFirst(3);
		list.addFirst(2);
		//System.out.println("Head now is: " + list.first());
		list.addLast(4);//but can also have any type! the power of the generic <E>
		//System.out.println("Head now is: " + list.first());
		list.addFirst(1);
		//System.out.println("Head now is: " + list.first());

		//now try the new addIndex method!!
		list.addIndex("Did it work?", 3);
		//System.out.println("Contents in list so far: ");
		//will need an iterator to be able to go through the linked list! so declare on!
		//but for now just use a for loop. 
		//System.out.println(list.printSummary());
		
		for (int i = 0; i <list.size();i++) {
			list.printSummary();
		}
		//System.out.println("size: "+ list.size() );
		System.out.println("last is "+list.last());
		System.out.println("empty: " + list.isEmpty());
		//System.out.println("Head now is: " + list.first());
		
		SinglyLinkedList<Object> listCopy= new SinglyLinkedList<Object>();
		listCopy=list.clone();	
	}

}
