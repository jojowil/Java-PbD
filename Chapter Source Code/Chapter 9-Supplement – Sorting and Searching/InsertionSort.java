public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int x, y, t;

        for (x = 0; x < arr.length; x++) {

            t = arr[x];
            y = x;

            while ( y > 0 && t < arr[y-1]) {
                arr[y] = arr[y-1];
                //print_debug(arr, x, y);
                y--;
            }

            arr[y] = t;

            print_debug(arr, x, y);
        }
    }

    public static void print_debug(int[] a, int x, int y){
        // Not part of sort routine.
        // Only used to print debug info!

        System.out.printf("x=%2d, y=%2d arr=", x, y);
        for (int i = 0; i < a.length; i++)
            System.out.printf("%3d", a[i]);
        System.out.println();
        // end debug
    }

    public static void main(String[] args) {

        int x, a[] = {2, 21, 27, 35, 10, 25, 47, 45, 37, 19, 15, 50, 16, 12, 0, 42, 44, 6, 20, 9};

        insertionSort(a);

    }
}
