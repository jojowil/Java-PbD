import java.util.*;

public class p10 extends P10Class {

    public static Scanner kb = new Scanner(System.in);
    public static void main (String[] args) {

        int[] a = new int[1000], b = new int[1000];

        int x, n, sn, bn, sr, br;

        for ( x = 0; x < 1000; x++ ) {
            a[x] = (int)(Math.random() * 1000);
            b[x] = a[x];
        }

        Arrays.sort(b);

        System.out.printf("1000 random numbers from 0 to 999 have been generated\n");
        System.out.printf("Enter an integer to search the arrays or EOF to stop: ");
        while ( kb.hasNext() ) {

            n = kb.nextInt();

            sr = seq_search(a, n);
            br = bin_search(b, n);
            if ( sr != -1 )
                System.out.printf("\nsequential search found the value %4d in element %3d with %5d items scanned.\n", n, sr, SEQ_NUM);
            else
                System.out.printf("\nsequential search did not find the value with %5d items scanned.\n", SEQ_NUM);

            if ( br != -1 )
                System.out.printf("binary     search found the value %4d in element %3d with %5d items scanned.\n", n, br, BIN_NUM);
            else
                System.out.printf("binary     search did not find the value with %5d items scanned.\n", BIN_NUM);

            System.out.printf("\nEnter an integer to search the arrays or EOF to stop: ");
        }
    }
}

