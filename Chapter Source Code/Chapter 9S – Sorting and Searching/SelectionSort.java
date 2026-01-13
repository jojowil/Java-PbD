import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        System.out.println(Arrays.toString(arr) + "\n");

        for (int x = 0; x < arr.length - 1; x++) {
            int min = x, y;
            for (y = x + 1; y < arr.length; y++)
                if (arr[y] < arr[min])
                    min = y;

            int t = arr[min];
            arr[min] = arr[x];
            arr[x] = t;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 21, 27, 35, 10, 25, 47, 45, 37, 19, 15, 50, 16, 12, 0, 42, 44, 6, 20, 9};

        selectionSort(a);
    }
}