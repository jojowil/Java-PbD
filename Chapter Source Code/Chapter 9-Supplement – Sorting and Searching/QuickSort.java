public class QuickSort {

    public static void qsort(int[] arr) {

        qsort1(arr, 0, arr.length-1);
    }

    public static void qsort1(int[] arr, int l, int u) {
        int m, x, t;

        if ( l >= u )
            return;
        m = l;
        for (x = l+1; x <= u; x++) {
            if ( arr[x] < arr[l] ) {
                m++;
                t = arr[m];
                arr[m] = arr[x];
                arr[x] = t;
            }
        }
        t = arr[l];
        arr[l] = arr[m];
        arr[m] = t;
        qsort1(arr, l, m-1);
        qsort1(arr, m+1, u);
    }

    public static void main(String[] args) {

    }
}