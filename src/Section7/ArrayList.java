package Section7;
public class ArrayList<E> implements List<E> {
	
	//this will require some instance variables
	private E[] data;//the array used to store the list references
	private int size=0;//the size var, used in the methods below!
	
	//user specified capacity
	/**
	 * This creates an ArrayList with max capacity of capacity
	 * @param capacity
	 */
	public ArrayList(int capacity) {
		data= (E[]) new Object[capacity];//this is a safe cast
	}

	public static void main(String[] args) {
		/**
		 * This is actually really smart. Because even though I set the capacity to 2, the size of the arraylist 
		 * is dependent on how many objects are actually inside the arraylist at the time of call to the size() method.
		 * 
		 */
		ArrayList<Object> arrayList=new ArrayList<Object>(2);
		arrayList.add(0, "first element");
		System.out.println("The ArrayList that was created was of size 2.");
		System.out.println("Size is: "+arrayList.size());//this is because the size of the arrayList is the num of elements in the arrayList. 
		System.out.println("Now going to add in some elements, this will cause resize() to be called after the 2nd insertion!");
		System.out.println("Adding in an element, no call to resize!");
		arrayList.add(1, "second element");
		System.out.println("Adding in the second element, this should now call resize");
		arrayList.add(2, "third element");
		System.out.println("The size of the ArrayList is now " + arrayList.size() + " after 2 insertions");
		arrayList.add(3, "fourth element");
		System.out.println("The size of the ArrayList is now " + arrayList.size() + " after 1 more insertion");	
	}
	
	public int size() {return size;}
	
	public boolean isEmpty() {return size()==0;}
	/** Returns (but does not remove) the element at index i. */
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i]; 
		}
	
	public E set(int i , E e)throws IndexOutOfBoundsException {
		checkIndex(i, size);
		//as i need to return the old element that is being replaced, just store it in a temp var
		E temp=data[i];
		data[i]=e;
		return temp;
	}
	
	public void add(int i , E e) throws IndexOutOfBoundsException{
		checkIndex(i, size+1);//check if it is possible
		//check if the array is full first!
		if(size==data.length) {resize(2*data.length);}
		for(int k =size-1;k>=i;k--) {
			data[k+1]=data[k];//shifting the elements rightwards
		}
		data[i]=e;//now can place the new element! We know we are there because k==i, the index we are meant to insert
		size++;
	}
	
	public E remove(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		//again need to store the old element in the temp var
		E temp =data[i];
		//now to shift everything leftwards
		//start at index i, then work upwards until we reach the size of the array
		for(int k =i;k<size-1;k++) {
			data[k]=data[k+1];
		}
		data[size-1]=null;//just so we don not have any remnants left over after moving everything
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException { 
		 if (i < 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	} 
	
	protected void resize(int capacity) {
		E[] temp=(E[]) new Object[capacity];
		System.out.println("Now resizing the array...");
		for(int k=0;k<size;k++) {
			temp[k]=data[k];
		}
		data=temp;//start using the new array
	}

}
