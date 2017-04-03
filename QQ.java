public class QQ<E> implements Deque<E> {

    private DLLNode<E> _node;
    private int _size;
    
    public QQ () {
	_node = null;
	_size = 0;
    }
    
    public void addFirst(E x){

	
	DLLNode<E> temp = new DLLNode<E>(x, null, null);
	
	if (_size == 0) {
	    _node = temp;
	}
	else {
	    temp.setNext(_node);
	    _node = temp;
	}
	_size += 1;

    }

    public static void main () {

    }

}
