//Arif Roktim
//APCS2 pd04
//HW29 -- Stress is the Best
//2017-04-05
public class DequeTester{

    public static void main( String[] args ){
        Deque<String> test;

        System.out.println( "==========Testing as a Deque==========" );
        System.out.println( "Adding to end: bob, dog, test" );
        test = new QQ<String>();
        //Deque should be: FRONT -> bob -> END
        test.addLast( "bob" );
        //Deque should be: FRONT -> bob -> dog -> END
        test.addLast( "dog" );
        //Deque should be: FRONT -> bob -> dog -> test -> END
        test.addLast( "test" );
        System.out.println( "Printing: " + test );

        System.out.println( "Adding to beginning: jake, alan, nodes" );
        //Deque should be: FRONT -> jake -> bob -> dog -> test -> END
        test.addFirst( "jake" );
        //Deque should be: FRONT -> alan -> jake -> bob -> dog -> test -> END

        test.addFirst( "alan" );
        //Deque should be: FRONT -> nodes -> alan -> jake -> bob -> dog -> test -> END
        test.addFirst( "nodes" );
        System.out.println( "Printing: " + test );

        //Deque should be: FRONT -> alan -> jake -> bob -> dog -> test -> END
        System.out.println( "Removed from first: " + test.removeFirst() );
        //Deque should be: FRONT -> jake -> bob -> dog -> test -> END
        System.out.println( "Removed from first: " + test.removeFirst() );
        System.out.println( test );
        //Deque should be: FRONT -> jake -> bob -> dog -> END
        System.out.println( "Removed from last: " + test.removeLast() );
        //Deque should be: FRONT -> jake -> bob -> END
        System.out.println( "Removed from last: " + test.removeLast() );
        //System.out.println( "Printing: " + test );
        //Printing Deque after removing things throws an exception

        System.out.println( "\n==========Testing as a FILO============" );
        System.out.println( "Pushed: bob, dog, test" );
        test = new QQ<String>();
        test.addFirst( "bob" );
        test.addFirst( "dog" );
        test.addFirst( "test" );
        /* If Deque ends up as:
         *      FRONT -> test -> dog -> bob -> END
         * then pushing adds to the front of the Deque and popping should remove from the front too.
         * If Deque reads as:
         *      FRONT -> bob -> dog -> test -> END
         * then pushing adds to the end of the Deque and popping should remove from the end too.
         */
        System.out.println( test );
	
        System.out.println( "\n==========Testing as a FIFO============" );
        System.out.println( "Added: bob, dog, test" );
        test = new QQ<String>();
        test.addLast( "bob" );
        test.addLast( "dog" );
        test.addLast( "test" );
        /* If Deque ends up as:
         *      FRONT -> bob -> dog -> test -> END
         * then adding adds to the end of the Deque and removing should happen at the beginning of the Deque.
         * If Deque ends up as:
         *      FRONT -> test -> dog -> bob -> END
         * then adding adds to the beginning of the Deque and removing should happen at the end of the Deque.
         */
        System.out.println( "Printing: " + test );

        System.out.println( "\nTesting exception handling." );
        // If a NullPointerException is thrown, the remove methods aren't checking that Deque isn't empty before removing.
        test.removeFirst();
	
    }
}
