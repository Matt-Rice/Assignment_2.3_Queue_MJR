/**
 * Generic class for a linked list
 * @author Matt Rice
 * @version 09/07/2022
 *LinkedList.java
 */
public class LinkedList<T> {
	//Instance variables
	private Node head;//the node at the front of the linked list
	private int length;//the amount of nodes within the linked list
	private Node tail;//the last node within the linked list
	//constructor
	/*
	 * Creates a linked list object and will initialize the variables
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end LinkedList
	/**
	 * Method to see if the linked list is empty
	 * @return true if the list is empty and false if not
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	/**
	 * Returns the head of the list(allows the user to get nodes within the list
	 * @return the head node
	 */
	public Node getList()
	{
		return head;
	}//end getList
	/**
	 * Gets the tail of the List
	 * @return the tail node of the list
	 */
	public Node getTail() {
		return tail;
	}//end getTail
	/**
	 * Method that returns the length of the linked list
	 * @return the number of nodes within the list
	 */
	public int getLength() {
		return length;
	}//end getLength
	/**
	 * Adds a node to the list
	 * @return void
	 * @param aNode the node that will be added
	 */
	public void addNode(Node aNode){
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}//end addNode
	/**
	 * Method to remove the Node at the head of the linked list
	 * @return T the data stored within the Node that is removed form the front
	 */
	public T removeNode() throws EmptyListException{
		if(isEmpty()) {
			throw new EmptyListException();
		}//end if
		
		Node<T> result = head;
		head=head.nextNode;
		if(head==null)
			tail=null;
		length--;
		return result.getData();
	}
}//end LinkedList.java

