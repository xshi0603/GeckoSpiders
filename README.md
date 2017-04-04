# GeckoSpiders 
<h3>Xing Tao Shi, Taylor Wong, Chris Yu</h3>
<h2>interface Deque[E] </h2>-- to be implemented in class QQ
  <h3>Methods</h3>
    <p>addFirst(E x);</p>
    <p>addLast(E x);</p>
    <p>removeFirst();</p>
    <p>removeLast();</p>
    <p>peekFirst();</p>
    <p>peekLast();</p>
    
<h2>class QQ implements Deque[E]</h2>
  <h3>Methods</h3>
  NOTE: given any DLLNode created in this class, the "next" point to who's behind you, and the "previous" point to who's in front of you
    <h4>addFirst(E x)</h4>
      PURPOSE: add the element to the front of the list
      HOW:
          1. Adds the element x of type E as the cargo of a new DLLNode. 
          2. The "next" of this node points to the node that is currently the front of the queue
          3. The "previous" of this node point to null (because now it's the first element, so there's no one in front)
          4. Point the front variable to this new node
      
      
