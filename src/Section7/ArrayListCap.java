package Section7;

public class ArrayListCap<E> implements List<E> {
	//this will require some instance variables
	public static final int CAPACITY=16;
	private E[] data;//the aray used to store the list references
	private int size=0;//the size var, used in the methods below!
	
	//some constructors
	//default capacity
	public ArrayListCap() { this(CAPACITY);}
	//user specified capacity
	public ArrayListCap(int capacity2) {
		data= (E[]) new Object[capacity2];//this is a safe cast
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//making an ArrayList of size 20
		ArrayListCap<Object> arrayList=new ArrayListCap<Object>(20);
		arrayList.add(0, "first element");
		System.out.println("Size is: "+arrayList.size());
		//this line gives an error as it is out of bounds.
		//System.out.println(arrayList.get(29));
		
		
	}
	
	public int size() {return size;}
	
	public boolean isEmpty() {return size()==0;}
	/** Returns (but does not remove) the element at index i. */
	public E get(int i) throws IndexOutOfBoundsException {
		return data[i]; 
		}
	
	public E set(int i , E e)throws IndexOutOfBoundsException {
		//as i need to return the old element that is being replaced, just store it in a temp var
		E temp=data[i];
		data[i]=e;
		return temp;
	}
	
	public void add(int i , E e) throws IndexOutOfBoundsException{
		//check if the array is full first!
		if(size==data.length) {System.out.println("Array is full!!");}
		for(int k =size-1;k>=i;k--) {
			data[k+1]=data[k];//shifting the elements rightwards
		}
		data[i]=e;//now can place the new element! We know we are there because k==i, the index we are meant to insert
		size++;
	}
	
	public E remove(int i) throws IndexOutOfBoundsException{
		//again need to store the old element in the temp var
		E temp =data[i];
		//now to shift everything leftwards
		//start at index i, then work upwards untill we reach the size of the array
		for(int k =i;k<size-1;k++) {
			data[k]=data[k+1];
		}
		data[size-1]=null;//just so we don not have any remnants left over after moving everthing
		size--;
		return temp;
	}

}