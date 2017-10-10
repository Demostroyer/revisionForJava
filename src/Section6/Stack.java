package Section6;
/**
 * A collection of objects that are inserted/removed based on the LIFO principle.
 * NB: Interfaces have methods that do not have any body, and therefore the interface must be used by some
 * concrete class. 
 * @author demps
 * NOTE: the use of the generic data type E allows the stack to contain any elements of any specified (referenced) type
 * @param <E>
 */
public interface Stack<E> {
	/**
	 * returns the number of elements in the stack
	 * @return number of elements in the stack
	 */
	int size();
	/**
	 * returns T/F is the stack is empty
	 * @return T if it empty, F otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Inserts an element at the top of the stack
	 * @param e
	 */
	void push(E e);
	
	/**
	 * Shows what is the top element of the stack
	 * @return element e is returnd but not removed, or null if empty
	 */
	E top();
	
	/**
	 * Takes the top element of the stack off.
	 * @return removes the top element of the stack, null if empty
	 */
	E pop();
}
