import java.util.Arrays;

class SelectionSort {

    public static void selectionSort(int arr[]) {
        int x, y, t, min;

        System.out.println(Arrays.toString(arr) + "\n");

        for (x = 0; x < arr.length - 1; x++) {

            min = x;
            for (y = x + 1; y < arr.length; y++)
                if (arr[y] < arr[min])
                    min = y;

            t = arr[min];
            arr[min] = arr[x];
            arr[x] = t;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int a[] = {2, 21, 27, 35, 10, 25, 47, 45, 37, 19, 15, 50, 16, 12, 0, 42, 44, 6, 20, 9};

        selectionSort(a);
    }
}