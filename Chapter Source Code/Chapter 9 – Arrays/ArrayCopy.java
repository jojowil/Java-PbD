import java.util.Arrays;

public class ArrayCopy {

    public static void resetArray(int[] a) {

        int x;
        for ( x = 0; x < a.length; x++)
            a[x] = 0;
    }

    public static void printArray(int[] a) {

        int x, len = a.length;
        for (x = 0; x < len; x++)
        {
            System.out.println("Value at index " + x + " is " + a[x]);
        }

    }

    public static void main(String[] args) {

        int[] ia1 = new int[5];
        int[] ia2 = new int[5];
        int x;

        // initialize the array to random numbers.
        for (x = 0; x < ia1.length; x++)
            ia1[x] = (int) (Math.random() * 100 + 1);

        // display array contents.
        System.out.println("\nContents of ia1");
        printArray(ia1);

        // deep copy ia2 into ia1 with for loop
        System.out.println("\nUsing for loop");
        for (x = 0; x < ia1.length; x++)
            ia2[x] = ia1[x];

        printArray(ia2);

        // deep copy with arraycopy()
        resetArray(ia2);
        System.out.println("\nUsing System.arraycopy()");
        System.arraycopy(ia1, 0, ia2, 0, ia1.length);
        printArray(ia2);

        // shallow copy ia2 to ia1
        System.out.println("\nBefore shallow copy");
        System.out.println("ia1 hash = " + System.identityHashCode(ia1));
        System.out.println("ia2 hash = " + System.identityHashCode(ia2));

        ia2 = ia1;
        System.out.println("\nAfter shallow copy");
        System.out.println("ia1 hash = " + System.identityHashCode(ia1));
        System.out.println("ia2 hash = " + System.identityHashCode(ia2));

        // Use Arrays.copyOf() ­ JDK 6
        System.out.println("\nUsing Arrays.copyOf() with ia1.length*2");
        ia2 = Arrays.copyOf(ia1, ia1.length * 2);
        printArray(ia2);

    }
}
