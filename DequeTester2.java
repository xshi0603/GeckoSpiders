public class DequeTester2 {
     public static void main(String args[]) {
	LLDeque<String> deque = new LLDeque<String>();
	System.out.println(deque.size()); // should return 0
	System.out.println("Starts as: " + deque);
	deque.addFront("bip"); //adds to front
	deque.addLast("bop"); //adds to last
	deque.addFront("bam"); // adds another to front
	System.out.println("Now it's: " + deque);
	System.out.println(deque.removeLast()); // remove last element
	System.out.println("Removed one: " + deque);
	System.out.println(deque.removeFront()); // removes first element
	System.out.println("Removed one: " + deque); // 
	System.out.println(deque) // should return the element bop, could change based on 
	the user's pointer
    }
}