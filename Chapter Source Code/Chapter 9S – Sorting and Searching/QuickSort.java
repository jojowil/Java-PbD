public class QuickSort {

    public static void qsort(int[] arr) {
        qsort1(arr, 0, arr.length - 1);
    }

    /**
     * Move values around a pivot point. This uses the lower bound
     * to set the initial pivot.
     *
     * @param arr array of ints
     * @param l   lower bound
     * @param u   upper bound
     */
    public static void qsort1(int[] arr, int l, int u) {
        int t;

        if (l >= u)
            return;
        int p = l; // pivot begins at lower bound
        for (int x = l + 1; x <= u; x++) {
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

        print_debug(arr, l, u, p);
        qsort1(arr, l, p - 1);
        qsort1(arr, p + 1, u);
    }

    public static void print_debug(int[] a, int l, int u, int p) {
        // Not part of sort routine.
        // Only used to print debug info!
        System.out.printf("l=%2d, u=%2d, p=%2d arr=", l, u, p);
        for (int j : a) System.out.printf("%3d", j);
        System.out.println();
        // end debug
    }

    public static void main(String[] args) {
        int[] a = {2, 21, 27, 35, 10, 25, 47, 45, 37, 19, 15, 50, 16, 12, 0, 42, 44, 6, 20, 9};

        // this prints the indexes of the array
        System.out.print("                     ");
        for (int x = 0; x < a.length; x++)
            System.out.printf("%3d", x);
        System.out.println("\n");

        qsort(a);
    }
}