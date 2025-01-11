import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class StressSort {

    public static void bubbleSort(int arr[]) {
        boolean swapped;

        do {
            swapped = false;

            for ( int x = 1; x < arr.length; x++) {
                if ( arr[x] < arr[x-1] ) {
                    int t = arr[x];
                    arr[x] = arr[x-1];
                    arr[x-1] = t;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void insertionSort(int[] arr) {

        int x, y, t;

        for (x = 0; x < arr.length; x++) {

            t = arr[x];
            y = x;

            while ( y > 0 && t < arr[y-1]) {
                arr[y] = arr[y-1];
                y--;
            }

            arr[y] = t;
        }
    }

    public static void selectionSort(int[] arr) {

        int x, y, t, min;

        for (x = 0; x < arr.length - 1; x++) {

            min = x;
            for (y = x + 1; y < arr.length; y++)
                if (arr[y] < arr[min])
                    min = y;

            t = arr[min];
            arr[min] = arr[x];
            arr[x] = t;
        }
    }

    public static void shellSortOrig(int[] arr) {

        int x, y, t, gap;

        for ( gap = arr.length/2; gap > 0; gap=gap/2 ) {

            for ( x = gap; x < arr.length; x++ ) {

                t = arr[x];
                for ( y = x; y >= gap && arr[y-gap] > t; y=y-gap ) {
                    arr[y] = arr[y-gap];
                }

                arr[y] = t;
            }
        }
    }

    public static void shellSortInSed(int[] arr) {

        int[] gaps = {1391376, 463792, 198768, 86961, 33936, 13776, 4592, 1968, 861, 336, 112, 48, 21, 7, 3, 1};
        int g, x, y, t, gap;

        for ( g = 0; g < gaps.length; g++ ) {

            gap = gaps[g];
            for ( x = gap; x < arr.length; x++ ) {

                t = arr[x];
                for ( y = x; y >= gap && arr[y-gap] > t; y=y-gap ) {
                    arr[y] = arr[y-gap];
                }

                arr[y] = t;
            }
        }
    }

    public static void shellSortBentlyA(int[] arr) {

        int gap, x, y, t, n;

        n = arr.length;

        // Find largest gap based on 3.
        for ( gap = 1; gap < n; gap=3*gap+1 );
        while (true) {
            gap /= 3;

            if ( gap < 1)
                break;

            for ( x = gap; x < n; x++ ) {
                for ( y = x; y >= gap; y=y-gap ) {
                    if ( arr[y-gap] < arr[y] )
                        break;
                    t = arr[y];
                    arr[y] = arr[y-gap];
                    arr[y-gap] = t;
                }
            }
        }
    }

    public static void shellSortBentlyA2(int[] arr) {

        int g, gap, x, y, t, n;

        n = arr.length;

        // Find largest gap based on 3.
        for ( g = 1; g < n; g=3*g+1 );
        for ( gap = g/3; gap > 0; gap=gap/3 ) {

            for ( x = gap; x < n; x++ ) {
                for ( y = x; y >= gap; y=y-gap ) {
                    if ( arr[y-gap] <= arr[y] )
                        break;
                    t = arr[y];
                    arr[y] = arr[y-gap];
                    arr[y-gap] = t;
                }
            }
        }
    }

    public static void shellSortBentlyB(int[] arr) {

        int[] gaps = {1391376, 463792, 198768, 86961, 33936, 13776, 4592, 1968, 861, 336, 112, 48, 21, 7, 3, 1};
        int g, x, y, t, gap, n;

        n = arr.length;
        for ( g = 0; g < gaps.length; g++ ) {

            gap = gaps[g];

            for ( x = gap; x < n; x++ ) {
                for ( y = x; y >= gap; y=y-gap ) {
                    if ( arr[y-gap] < arr[y] )
                        break;
                    t = arr[y];
                    arr[y] = arr[y-gap];
                    arr[y-gap] = t;
                }
            }
        }
    }

    public static void qsort(int[] arr) {

        qsort1(arr, 0, arr.length-1);
    }

    public static void qsort1(int[] arr, int l, int u) {
        int p, x, t;

        if (l >= u)
            return;
        p = l; // pivot begins at lower bound
        for (x = l + 1; x <= u; x++) {
            if (arr[x] < arr[l]) {
                p++;
                // swap
                t = arr[p];
                arr[p] = arr[x];
                arr[x] = t;
            }
        }
        // swap
        t = arr[l];
        arr[l] = arr[p];
        arr[p] = t;

        qsort1(arr, l, p - 1);
        qsort1(arr, p + 1, u);
    }

    public static void main(String[] args)
    {
        int ASIZE=100000000;
        int[] a1 = new int[ASIZE], a2 = new int[ASIZE], a3 = new int[ASIZE];
        int[] a4 = new int[ASIZE], a5 = new int[ASIZE], a6 = new int[ASIZE];
        int[] a7 = new int[ASIZE], a8 = new int[ASIZE], a9 = new int[ASIZE];
        int x, n;
        long s, e;

        for ( x = 0; x < ASIZE; x++ ) {
            n = ThreadLocalRandom.current().nextInt(1, 10000000);
            a1[x] = n;
            a2[x] = n;
            a3[x] = n;
            a4[x] = n;
            a5[x] = n;
            a6[x] = n;
            a7[x] = n;
            a8[x] = n;
            a9[x] = n;
        }

        System.out.print("Bubble Sort ");
        s = System.nanoTime();
        //bubbleSort(a1);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Selection Sort ");
        s = System.nanoTime();
        //selectionSort(a2);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Insertion Sort ");
        s = System.nanoTime();
        //insertionSort(a3);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Shell Sort Original ");
        s = System.nanoTime();
        shellSortOrig(a4);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Shell Sort InSed ");
        s = System.nanoTime();
        shellSortInSed(a5);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Shell Sort Bently A ");
        s = System.nanoTime();
        shellSortBentlyA2(a6);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Shell Sort Bently B ");
        s = System.nanoTime();
        shellSortBentlyB(a7);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Arrays.sort() ");
        s = System.nanoTime();
        Arrays.sort(a8);
        e = System.nanoTime();
        reportTime(s, e);

        System.out.print("Quicksort ");
        s = System.nanoTime();
        qsort(a9);
        e = System.nanoTime();
        reportTime(s, e);
    }

    public static void reportTime(long s, long e) {
        long t = e - s;
        System.out.println("Execution time in milliseconds : " + t / 1000000);
    }
}
