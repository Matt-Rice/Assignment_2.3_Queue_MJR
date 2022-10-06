
/**
 * An interface for the ADT queue
 * @author Matt Rice
 * @version 09/29/22
 * QueueInterface
 * Fall 2022
 */
	/** An interface for the ADT queue.  */
	public interface QueueInterface<T>
	{
	  /** Adds a new entry to the back of this queue.
	      @param newEntry  An object to be added. */
	  public void enqueue(Node newEntry);
	  
	  /** Removes and returns the data of the entry at the front of this queue.
	      @return  The data of the entry at the front of the queue. 
	      @throws  EmptyQueueException if the queue is empty before the operation. */
	  public T dequeue();
	  
	  /**  Retrieves the entry at the front of this queue.
	      @return  The object at the front of the queue.
	      @throws  EmptyQueueException if the queue is empty. */
	  public T getFront();
	  
	  /** Detects whether this queue is empty.
	      @return  True if the queue is empty, or false otherwise. */
	  public boolean isEmpty();
}//end QueueInterface
