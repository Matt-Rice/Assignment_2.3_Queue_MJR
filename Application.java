
/**
 * A class to test the methods from the queue class and VeggieBurger Palace
 * @author Matt Rice
 * @version 09/29/22
 * Application
 * Fall 2022
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiating a queue to test the methods of the Queue class
		Queue<String> line=new Queue<String>();

		 //Instantiating nodes and enqueuing them into the queue so operations can be performed
			Node<String> entry1=new Node<String>("One");
				line.enqueue(entry1);//Enqueue entry1
			
			Node<String> entry2= new Node<String>("Two");
				line.enqueue(entry2);//enqueue entry2
			
			Node<String> entry3= new Node<String>("Three");
				line.enqueue(entry3);//enqueue entry3
			
			Node<String> entry4= new Node<String>("Four");
				line.enqueue(entry4);//enqueue entry4
				
		 //Prints the Queue with four elements in the queue
		 line.printQueue();
		 	
		 	//Dequeues several elements of the queue
		  	System.out.println("\nRemoves entry1: " + line.dequeue());//Dequeue entry1
		  	System.out.println("Removes entry2: " + line.dequeue());//dequeue entry2
		  	System.out.println("Removes entry3: " + line.dequeue());//dequeue entry3
		  	
		  	System.out.println("\nHere is the queue when three entries are dequeued");
		  	line.printQueue();
		  	
		  	//Dequeues the last entry in the queue making it empty and printing it
		  	System.out.println("\nHere is the queue with all of the entries dequeued");
		  	line.dequeue();//dequeue entry4
		  	line.printQueue();//Will test the isEmpty method since the queue is empty
		  
		//Number 2
		System.out.println("\nNumber 2: VegeBurger Palace");
		  
		Queue<String> vegeBurger= new Queue<String>();
		
			//Instantiating a node for Bill, enqueue Bill and print the queue
			Node<String> bill=new Node<String>("Bill");
				vegeBurger.enqueue(bill);//enqueue bill
				System.out.println("\nBill arrives");
		  		vegeBurger.printQueue();
		  	
		  	//Instantiate node for Alice, enqueue Alice and print queue
		  	Node<String> alice=new Node<String>("Alice");
		  		vegeBurger.enqueue(alice);//enqueue alice
		  		System.out.println("\nAlice arrives");
		  		vegeBurger.printQueue();
		  		
		  	//Instantiate Bob, enqueue him and print queue
		  	Node<String> bob= new Node<String>("Bob");
		  		vegeBurger.enqueue(bob);//enqueue bob
		  		System.out.println("\nBob arrives");
		  		vegeBurger.printQueue();
		  	
		  	//A customer is served so dequeue and print queue
		  		vegeBurger.dequeue();//dequeue bill
		  		System.out.println("\nA customer is served");
		  		vegeBurger.printQueue();
		  	
		  	//Instantiating node for Jane, enqueue her, and print queue
		  	Node<String> jane = new Node<String>("Jane");
		  		vegeBurger.enqueue(jane);//enqueue jane
		  		System.out.println("\nJane arrives");
		  		vegeBurger.printQueue();
		  		
		  	//Instantiate Hamad enqueue him and print queue
		  	Node<String> hamad = new Node<String>("Hamad");
		  		vegeBurger.enqueue(hamad);//enqueue hamad
		  		System.out.println("\nHamad arrives");
		  		vegeBurger.printQueue();
		  
		  	//Two customers are served so dequeue and print the queue
		  		System.out.println("\nTwo customers are served");
		  		vegeBurger.dequeue();//dequeue alice
		  		vegeBurger.printQueue();
		  		vegeBurger.dequeue();//dequeue bob
		  		vegeBurger.printQueue();
		  		
		  	//Instantiate node for Jim enqueue him and print queue
		  	Node<String> jim = new Node<String>("Jim");
		  		vegeBurger.enqueue(jim);//enqueue jim
		  		System.out.println("\nJim arrives");
		  		vegeBurger.printQueue();
		  		
		  	//Another customer is served so dequeue and print the queue
		  		System.out.println("\nAnother customer is served");
		  		vegeBurger.dequeue();//dequeue jane
		  		vegeBurger.printQueue();
		  		
		  	//Another customer is served so dequeue and print
		  		System.out.println("\nAnother customer is served");
		  		vegeBurger.dequeue();//dequeue hamad
		  		vegeBurger.printQueue();
	}//end Main method

}//end Application
