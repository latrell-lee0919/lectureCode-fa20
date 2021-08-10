public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /** If 2 numbers in a row are the same, add them together */
    public void addAdjacent() {
        // need to traverse the list
        IntList curr = this;

        while (curr.rest != null) {
            // need to compare first value with the next value
            if (curr.first == curr.rest.first) {
                // if values are same, reassign them so that the sum is 1st value
                curr.first = curr.first + curr.rest.first;

                // make it so that only the sum is retained
                curr.rest = curr.rest.rest;
            } else {
                break;
            }
        }
    }

    /** Every time you add a value, you "square" the IntList */
    public void squareValue(int x) {
        // need to traverse the list
        IntList curr = this;

        while (curr != null) {
            // add the squared value of the current node right after it
            curr.rest = new IntList((curr.first * curr.first), curr.rest);

            if (curr.rest.rest == null) {
                curr.rest.rest = new IntList(x, null);
                break;
            }

            // move the pointer
            curr = curr.rest.rest;
        }
    }

    public static void main(String[] args) {
//        IntList L = new IntList(3, null);
//        L = new IntList(2, L);
//        L = new IntList(1, L);
//        L = new IntList(1, L);
//
//        L.addAdjacent();
        IntList L = new IntList(2, null);
        L = new IntList(1, L);

        L.squareValue(5);
        L.squareValue(7);

//        System.out.println(L.size());
    }
}