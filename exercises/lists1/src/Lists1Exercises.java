public class Lists1Exercises {
    public Lists1Exercises() {
    }

    public static IntList incrList(IntList var0, int var1) {
        // remember, values in var0 can NOT be modified

        // follow iterative method again
        int position = 0;

        // create variable that tracks pointer
        IntList value = var0;

        // need to create a new list
        IntList updatedList = new IntList(var0.first + var1, null);
        IntList listTracker = updatedList;

        // create a while loop that meets certain condition
        while (value.rest != null) {
            position += 1;
            value = value.rest;
            // each time there's a .rest in var0, create new IntList?
            updatedList.rest = new IntList(value.first + var1, null);
            updatedList = updatedList.rest;
        }

        return listTracker;

        /**
         * L = 5 -> 10 -> 20 -> null
         * L.incrList(L, 1); expect new list == 6 -> 11 -> 21 -> null
         * L2 = 5 -> null
         * L2 = 5 -> 10 -> null
         * L2 = 5 -> 10 -> 20 -> null
         * */

    }

    public static IntList dincrList(IntList var0, int var1) {
        // how to check all values in a list? iterate!

        // patterns of iterative methods -> temp var and while loop

        // create a temp position variable
        int position = 0;

        // create a variable that tracks pointer
        IntList value = var0;

        // create a while loop with a certain condition
        while(value != null) {
            // want to modify the var0.first values
            position += 1;
            value.first -= var1;
            value = value.rest;
        }

        return var0;

        /**
         * L = 1 -> 2 -> 3 -> 4 -> 5 -> null, var1 == 1
         * expect L = 0 -> 1 -> 2 -> 3 -> 4 -> null
         *
         * */
    }

    public static void main(String[] var0) {
        IntList var1 = new IntList(5, (IntList)null);
        var1.rest = new IntList(7, (IntList)null);
        var1.rest.rest = new IntList(9, (IntList)null);
//        System.out.println(var1.size());
//        System.out.println(var1.iterativeSize());
        //dincrList(var1, 1);
        IntList var2 = incrList(var1, 2);
    }
}
