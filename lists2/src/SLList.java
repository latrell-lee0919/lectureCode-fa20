/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within. */

public class SLList {

    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }

    }
    /** The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /** Creates an empty SLList */
    public SLList() {
        sentinel = new IntNode(0, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList(int[] x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x[0], null);
        size = 1;
        // iterate through the rest of the array
        for (int i = 1; i < x.length; i += 1) {
            // create pointer that starts at the beginning
            IntNode curr = sentinel;

            // make sure the next value is not null
            while (curr.next != null) {
                // update pointer to point to next value
                curr = curr.next;
            }

            // retain value at index in array by placing it in the next spot
            curr.next = new IntNode(x[i], null);

            // increment size by 1
            size += 1;
        }

    }

    public void addFirst(int x) {
        // goal is to add a node at the beginning of the list
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        // goal is to return the first node in the list
        return sentinel.next.item;
    }

    public void addLast(int x) {
        // loop through the list (recursively or iteratively) until first.next is null

        IntNode curr = sentinel;

        // move the pointer to the end, good job Latrell!
        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = new IntNode(x, null);// make sure to always add a node
        size += 1;
    }

    /** Delete first element in SLList */
    public void deleteFirst() {
        // remove value right after the sentinel node (sentinel.next)
        //sentinel.next = null; // bad, this removes everything

        // this is pretty much reassigning the sentinel pointer to point to
        // the next node of the original first pointer
        // remember when you reassign reference types, they end up going away
        // to the garbage collector
        sentinel.next = sentinel.next.next;

        // decrement the size by one
        size -= 1;
    }

//    /** Returns the size of the list that starts at IntNode p */
//    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//
//        return 1 + size(p.next);
//    }

    public int size() {
        return size;
        //return 1 + first.size(); // no S list pointers so need a helper method
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList l2 = new SLList(new int[]{1, 2, 3, 4});
        System.out.println(l2.size());
    }
}
