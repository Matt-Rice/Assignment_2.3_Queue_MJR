 
/**
 * Class that creates a constructor for a queue based off of a generic linked list
 * @author Matt Rice
 * @version 09/29/22
 * Queue
 * Fall 2022
 */
public class Queue<T> implements QueueInterface<T>{
	//Instance variable
	private LinkedList<T> queue;//creates the linked list that will be instatiatied as a queue
	/**
	 * Constructor that will implement a Queue ADT using a generic linked list
	 */
	public Queue(){
		queue=new LinkedList<T>();
		
	}//end Queue

	/**
	 * Method that will add a node to the end of the queue
	 * @param newEntry the entry to be added to the end of the queue
	 * @return void
	 */
	public void enqueue(Node newEntry) {
		queue.addNode(newEntry);
	}//end enqueue

	/**
	 * Method that will remove the entry at the front of the queue and return its data
	 * @return the data of the entry that was removed from the queue
	 */
	public T dequeue() {
		return queue.removeNode();
	}//end dequeue

	/**
	 * Method to return the data of the entry at the front of the queue
	 * @return the value stored within the entry at the front of the queue
	 */
	public T getFront() {
		Node<T> front=queue.getList();
		 return front.getData();
		
	}//end getFront

	/**
	 * Method to see if the queue is empty
	 * @return true if the queue is empty and false if the queue is not empty
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}//end isEmpty
	/**
	 * Method that returns the length of the queue
	 * @return the length of the queue
	 */
	public int getQueueLength() {
		return queue.getLength();
	}//end getQueueLength
	/**
	 * Prints out the data of the entries in the queue and the length of the queue
	 * @return void
	 */
	public void printQueue() {
		if(queue.isEmpty()) {
			System.out.println("This queue is empty");
		}//end if
		else {
			Node tempNode=queue.getList();
			System.out.println("These are the entries of the queue from front to back: ");
			for(int i=0;i<queue.getLength()+1;i++) {
				System.out.print(tempNode.getData()+" ");
				tempNode=tempNode.nextNode;
			
			
			}//end for
		System.out.println("\nThe length of the queue is currently " + (queue.getLength()+1));
		}//end else
	}//end printQueue
}//end Queue.java
