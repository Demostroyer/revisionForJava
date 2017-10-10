package Section6;
/**
 * This is an interface representing the structure a Queue takes, NB the FIFO principle
 * @author demps
 *
 * @param <E>
 */
public interface Queue<E> {
	/**Returns the number of elements in the queue**/
	int size();
	/**Tests whether the queue is empty**/
	boolean isEmpty();
	/**Inserts an element at the rear of the queue**/
	void enqueue(E e);
	/**Returns the element at the head of the quque, but doesn't remove it (null if empty).**/
	E first();
	/** Removes and returns the first element of the queue (null if empty). */
	E dequeue();

}
