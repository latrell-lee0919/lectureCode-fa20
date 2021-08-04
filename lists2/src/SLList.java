/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within. */

public class SLList {
    private IntNode first;
    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        // goal is to add a node at the beginning of the list
        first = new IntNode(x, first);
    }

    public int getFirst() {
        // goal is to return the first node in the list
        return first.item;
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList l = new SLList(15);
        l.addFirst(10);
        l.addFirst(5);
        System.out.println(l.getFirst());
    }
}
