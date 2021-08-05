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
    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        // goal is to add a node at the beginning of the list
        first = new IntNode(x, first);
        size += 1;
    }

    public int getFirst() {
        // goal is to return the first node in the list
        return first.item;
    }

    public void addLast(int x) {
        // loop through the list (recursively or iteratively) until first.next is null

        IntNode curr = first;

        // move the pointer to the end, good job Latrell!
        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = new IntNode(x, null);// make sure to always add a node
        size += 1;
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
        SLList l = new SLList(15);
        l.addFirst(10);
        l.addFirst(5);
        //System.out.println(l.getFirst());
        l.addLast(7);
    }
}
