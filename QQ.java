public class QQ<E> implements Deque<E> {

    private DLLNode<E> _front, _end;
    private int _size;
    
    public QQ () {
	_front = null;
	_end = null;
	_size = 0;
    }
    
    public void addFirst(E x){

	DLLNode<E> temp = new DLLNode<E>(x, null, null);
	
	if (_size == 0) { //if the QQ is empty
	    _front = temp;
	    _end = temp;
	}
	else { //if already consists of elements
	    temp.setNext(_front);
	    _front.setPrev(temp);
	    _front = temp;
	}
	_size += 1;

    }//O(1)

    public void addLast(E x) {

	DLLNode<E> temp = new DLLNode<E>(x, null, null);
	
	if (_size == 0) { //if the QQ is empty
	    _front = temp;
	    _end = temp;
	}
	else { //if already consists of elements
	    temp.setPrev(_end);
	    _end.setNext(temp);
	    _end = temp;
	}
	_size += 1;

    }//O(1)

    public E removeFirst() {

	E retVal = _front.getCargo();
	
	if (_size == 1) {
	    _front = null;
	    _end = null;
	}
	else {
	    _front = _front.getNext();
	    _front.setPrev(null);
	}
	_size -= 1;
	
	return retVal;

    }//O(1)

    public E removeLast() {

	E retVal = _end.getCargo();
	
	if (_size == 1) {//if one element left
	    _front = null;
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
