// CrispySpoon
// Xin Yi Chen, Joanna Zhou
// APCS2 pd4
// HW#29: Stress is the Best  
// 2017-4-4

public class DequeTester{
    
    public static void main( String[] args ) 
    {
	Deque<String> spoon = new QQ<String>();

	System.out.println("testing add....");

	spoon.addFirst("I");
	System.out.println(spoon + "   size:" + "spoon.size()");
	spoon.addLast("am");
	System.out.println(spoon + "   size:" + "spoon.size()");
	spoon.addLast("hungry");
	System.out.println(spoon + "   size:" + "spoon.size()");

	System.out.println("===============================================");

	System.out.println("peek....");

	System.out.println(spoon.peekFirst() + " " + spoon.peekLast());
	
	System.out.println("===============================================");
	
	/*System.out.println("testing contains....");

	System.out.println(spoon.contains("am"));//true
	System.out.println(spoon.contains("i"));//false
	
	System.out.println("===============================================");*/
	
	System.out.println("testing remove....");
	
	spoon.removeLast();
	System.out.println(spoon + "   size:" + "spoon.size()");
	spoon.removeFirst();
	System.out.println(spoon + "   size:" + "spoon.size()");
	spoon.removeLast();
	System.out.println(spoon + "   size:" + "spoon.size()");
	spoon.removeLast();
	System.out.println(spoon + "   size:" + "spoon.size()");

	System.out.println("===============================================");
	
	/*System.out.println("testing remove(Object)....");

	spoon.addFirst("I");
	spoon.addLast("am");
	spoon.add("hungry");
	spoon.addFirst("hi");
	spoon.addLast("am");
	spoon.add("hungry");
	
	spoon.removeFirstOccurrence("am");
	System.out.println(spoon + "   size:" + spoon.size());
	spoon.removeLastOccurrence("hungry");
	System.out.println(spoon + "   size:" + spoon.size());
	spoon.remove("I");
	System.out.println(spoon + "   size:" + spoon.size());
	spoon.remove("meow");
	System.out.println(spoon + "   size:" + spoon.size());


	System.out.println("===============================================");

	System.out.println("testing pop and push....");

	spoon.push("byeee");
	System.out.println(spoon + "   size:" + spoon.size());
	System.out.println(spoon.pop()+ "   size:" + spoon.size() );
	System.out.println(spoon.pop()+ "   size:" + spoon.size() );*/
    }//end main
    
}//end class
