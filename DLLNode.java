/*
Xing Tao Shi
APCS2 pd4
HW18a -- On the DLL
2017-3-15
 */
/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode<T>
{

    private T _cargo;    //cargo may only be of type String
    private DLLNode<T> _nextNode; //pointer to next LLNode
    private DLLNode<T> _prevNode; //pointer to next LLNode

    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode<T> next, DLLNode<T> previous ) 
    {

	_cargo = value;
	_nextNode = next;
	_prevNode = previous;
	
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode<T> getNext() { return _nextNode; }

    public DLLNode<T> getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) 
    {
	T oldCargo = _cargo;
	_cargo = newCargo;
	return oldCargo;
    }

    public DLLNode setNext( DLLNode newNext ) 
    {
	DLLNode oldNode = _nextNode;
	_nextNode = newNext;
	return oldNode;
    }

    public DLLNode setPrev( DLLNode newPrev ) 
    {
	DLLNode oldNode = _nextNode;
	_prevNode = newPrev;
	return oldNode;
    }
    
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }

    /*
    //main method for testing
    public static void main( String[] args ) 
    {


	//Below is an exercise in creating a linked list...

	//Create a node
	LLNode first = new LLNode( "cat", null );

	//Create a new node after the first
	first.setNext( new LLNode( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new LLNode( "cow", null ) );




	while( first != null ) {
	    System.out.println( first );
	    first = first.getNext();




	//Q: When head ptr moves to next node in list,
	//   what happens to the node it just left?
	// still exists but is no longer attached to the node
	// not exactly sure what head ptr is
    }//end main
    */
}//end LLNode


