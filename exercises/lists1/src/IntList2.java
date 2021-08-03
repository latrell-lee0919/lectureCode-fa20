public class IntList2 {
    int first;
    IntList2 rest;

    public IntList2(int var1, IntList2 var2) {
        first = var1;
        rest = var2;
    }

    public int recursiveSize() {
        if (rest == null) {
            return 1;
        }

        return 1 + this.rest.recursiveSize();
    }

    public int iterativeSize() {
        // create variable that keeps track of the size
        int sz = 0;

        // create variable that keeps track of the current object/node
        IntList2 pointer = this;

        // create a while loop with a condition that increments size and updates pointer
        while (pointer != null) {
            sz += 1;
            pointer = pointer.rest;
        }

        return sz;
    }

    public int iterativeGet() {
        // so we know with iterative stuff, we always need a temp var and a while loop

        // create a temp variable
        int temp = 0;

        // create a variable that tracks the current object
        IntList2 value = this;

        while(value != null) {
            temp += 1;
            value = value.rest;
        }


        return value.first;
    }


    public static void main(String[] var0) {
        IntList2 var1 = new IntList2(15, (IntList2)null);
        var1 = new IntList2(10, var1);
        var1 = new IntList2(5, var1);
        System.out.println(var1.iterativeSize());
        System.out.println(var1.recursiveSize());
    }


}
