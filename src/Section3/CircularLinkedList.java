package Section3;

public class CircularLinkedList {

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

}
