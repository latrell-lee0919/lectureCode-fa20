package exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class BLevel {
    @Test
    public void testArrays() {
        int[][] arr = { {1, 2}, {3, 4} };
        int[][] arr2 = { {1, 2}, {3, 4} };

        assertArrayEquals(arr, arr2);
    }

    @Test
    public void testObjects() {
        Object o1 = "hi";
        Object o2 = "hi";

        assertEquals(o1, o2);
        /** ^ this will return true as long as the values are the same.
         * Position in memory doesn't influence equality in this case. */
    }
}
