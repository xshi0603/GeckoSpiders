public class QQ<E> implements Deque<E> {

    private DLLNode<E> _front, _end;
    private int _size;
    
    public QQ () {
	_front = null;
	_end = null;
	_size = 0;
    }
	
/******************************************
* void addFirst(E x) -- adding element E to the front
* algo:
* 1. Create temp DLLNode with cargo equal to the element
* 2. If QQ is empty, set temp as _front and _end
* 3. Else:
	- temp points to what is currently _front
	- temp is set as _front's previous node
	- temp is set as _front
 ******************************************/	
	
    public void addFirst(E x){

	DLLNode<E> temp = new DLLNode<E>(x, null, null);
	
	if (_size == 0) { //if the QQ is empty
	    _front = temp; //_front and _end point to same value
	    _end = temp;
	}
	else { //if already consists of elements
	    temp.setNext(_front);
	    _front.setPrev(temp);
	    _front = temp;
	}
	_size += 1;

    }//O(1)
/******************************************
* void addLast(E x) -- adding element E to the end
* algo:
* 1. Create temp DLLNode with cargo equal to the element
* 2. If QQ is empty, set temp as _front and _end
* 3. Else:
	- _end points to temp
	- temp becomes _end
 ******************************************/	
    public void addLast(E x) {

	DLLNode<E> temp = new DLLNode<E>(x, null, null);
	
	if (_size == 0) { //if the QQ is empty
	    _front = temp; //_front and _end point to same value
	    _end = temp;
	}
	else { //if already consists of elements
	    temp.setPrev(_end);
	    _end.setNext(temp);
	    _end = temp;
	}
	_size += 1;

    }//O(1)
/******************************************
* E removeFirst() -- remove element from the front
* algo:
* 1. Set retVal equal to _front's cargo
* 2. If there is only 1 element in QQ, make _front and _end point to nothing
* 3. Else:
	- _front is set to next node
	- _front's previous node is set to null
 ******************************************/	
    public E removeFirst() {

	E retVal = _front.getCargo();
	
	if (_size == 1) {//if one element left
	    _front = null; //_front and _end point to nothing
	    _end = null;
	}
	else {
	    _front = _front.getNext();
	    _front.setPrev(null);
	}
	_size -= 1;
	
	return retVal;

    }//O(1)
/******************************************
* E removeLast() -- remove element from the end
* algo:
* 1. Set retVal equal to _end's cargo
* 2. If there is only 1 element in QQ, make _front and _end point to nothing
* 3. Else:
	- _end is set to previous node
	- _front's next node is set to null
 ******************************************/	
    public E removeLast() {

	E retVal = _end.getCargo();
	
	if (_size == 1) {//if one element left
	    _front = null; //_front and _end point to nothing
	    _end = null;
	}
	else {
	    _end = _end.getPrev();
	    _front.setNext(null);
	}	    
	_size -= 1;

	return retVal;

    }//O(1)

    public E peekFirst() {

	return _front.getCargo();

    }//O(1)

    public E peekLast() {

	return _end.getCargo();

    }//O(1)

    public String toString() { //overwriting toString method

	String retStr = "";
	DLLNode<E> temp = _front;

	for (int x = 0; x < _size; x++) { //traverse the QQ
	    
	    retStr += temp.getCargo() + "   ";
	    temp = temp.getNext();
	    
	}

	return retStr;

    }//O(n);


    public static void main (String[] args) {

	QQ<String> tester = new QQ<String>();
	tester.addFirst("hello");
	tester.addFirst("there");
	tester.addFirst("sweet");
	tester.addFirst("prince");
	System.out.println(tester);
	System.out.println(tester.removeFirst());
	System.out.println(tester.removeFirst());
	System.out.println(tester.removeLast());
	System.out.println(tester.removeLast());
	System.out.println(tester);
    }

}
