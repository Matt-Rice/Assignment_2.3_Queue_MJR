/**
 * Class that creates an EmptyListException that will be thrown when a list is already empty
 * @author Matt Rice
 * @version 9-29-22
 * EmptyListException
 * Fall 2022
 *
 */
public class EmptyListException extends RuntimeException {
	/**
	 * Constructor that will throw an exception when a list is empty
	 */
	public EmptyListException(){
		super("This list is empty");
	}//end EmptyListException
}//end EmptyListException
