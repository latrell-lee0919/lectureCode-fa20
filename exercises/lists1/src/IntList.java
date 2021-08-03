public class IntList {
    public int first;
    public IntList rest;

    public IntList(int var1, IntList var2) {
        this.first = var1;
        this.rest = var2;
    }

    public int size() {
        // recursively find the size of an intList
        // base case
        if (rest == null) {
            return 1;
        }

        // what happens if base case is not met
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        // set a variable that tracks size
        int s = 0; // int s = 1; <-- assumes first node is pointed to something
        // ^ this checks if the first node is null or not and then we move to the next one

        IntList temp = this; // first check if 5 is a node

        // create a while loop that makes sure rest is not null
        while (temp != null) {
            // add 1 to size if rest != null
            s += 1;

            // do something so that temp goes to next object
            temp = temp.rest;
        }

        // return the size
        return s;
    }

    /** Get the ith item of a list */
    public int recursiveGet(int var1) {
        // Base Case
        // if var1 == 0, return front item
        if (var1 == 0) {
            // return front item
            return this.first;
        }

        // anything other than base case
        // go forward (how?), possibly involves using temp variable

        // what do we do it var1 is not 0?
        // subtract until we get there

        return this.rest.recursiveGet(var1 - 1);

        /**
         * var1 = 4, starting list: L : 1 -> 2 -> 3 -> 4 -> 5 ; expected value == 5
         * 1st iteration, var1 != 0, so call this.rest.recursiveGet(3);
         * updated list: L : 2 -> 3 -> 4 -> 5;
         * 2nd iteration, var1 !=0, this.rest.recursiveGet(2);
         * updated list: L: 3 -> 4 -> 5;
         * 3rd iteration, var1 != 0, this.rest.recursiveGet(1);
         * updated list: L: 4 -> 5;
         * 4th iteration, var1 == 0, this.rest.recursiveGet(0);
         * updated list: L: 5 <--- expected value
         * */
    }

    public int iterativeGet(int var1) {
        int position = 0;
        IntList value = this;

        while(position != var1) {
            position += 1;
            value = value.rest;
        }

        return value.first;

        /**
         * L = 5 -> 10 -> 20 -> 30 -> 40 -> 50 -> null
         * L.iterativeGet(5); expect 50
         *
         * */
    }

    public static void main(String[] var0) {
        IntList var1 = new IntList(15, (IntList)null);
        var1 = new IntList(10, var1);
        var1 = new IntList(5, var1);
        System.out.println(var1.iterativeSize());
    }
}
