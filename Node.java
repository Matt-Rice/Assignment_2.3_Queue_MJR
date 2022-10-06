/**
 * Generic code for nodes
 * @author Matt Rice
 * @version 09/08/2022
 * Node.java
 */
public class Node<T> {
	
	//Instance variables
	T data;//data the data stored within the node
	Node nextNode;//nexNode the pointer that points to the next node
	
	//constructor
	/**
	 * Constructor for node that instantiates both instance variables	
	 */
	public Node(){
		nextNode=null;
		data=null;
		}//end Node
	/**
	 * Constructor that creates a node and puts data in it
	 * @param data the data to be stored inside the node
	 */
	public Node(T data) {
		nextNode=null;
		this.data=data;
	}//end Node
	/**
	 * a method to set the data within a node
	 * @return void
	 * @param data the data that will be set
	 */
	public void setData(T data) {
			this.data=data;
	}//end setData
	/**
	 * Method that gets the data from within the Node
	 * @return T the data from the desired node.
	 */
	public T getData() {
		return data;
	}
	/**
	 * Gets the node
	 * @return the node that the user desires
	 */
	public Node getNode() {
		return this;
	}//end getNode
	/**
	 * Sets the pointer to the next node
	 * @return void
	 * @param nextNode the value of the pointer to be set
	 */
	public void setNextNode(Node nextNode){
		this.nextNode=nextNode;
	}//end nextNode
	
	
}//end Node.java
