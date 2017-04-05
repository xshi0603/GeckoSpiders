# GeckoSpiders 
<h3>Xing Tao Shi, Taylor Wong, Chris Yu</h3>
<h2>interface Deque[E] </h2> Implemented in class QQ (Doubly-Linked Node Based)
  <h3>Methods</h3>
    <p>
      addFirst(E x):
      <br>
        enqueues item to the front of the queue
    </p>
    <p>
    addLast(E x):
    <br>
      enqueues item to the end of the queue
    </p>
    <p>
    removeFirst():
    <br>
      dequeues the first item in the queue
      </p>
    <p>
    removeLast():
    <br>
      dequeues item from the end of the queue
    </p>
    <p>
    peekFirst():
    <br>
      returns the first item in the queue so you can take a "peek" at it
      </p>
    <p>
    peekLast():
    <br>
      return the last item in the queue so you can take a "peek" at it
    </p>

<h3>
Deque is implemented using doubly-linked nodes because the nodes have pointer to 
what is in front and behind, allowing us to implement the methods above in O(1) runtime.      
</h3>
