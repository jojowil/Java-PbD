import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        boolean swapped;

        System.out.println(Arrays.toString(arr) + "\n");

        do {
            // no swap yet
            swapped = false;

            for (int x = 1; x < arr.length; x++) {
                if (arr[x] < arr[x - 1]) {
                    // swap values!
                    int t = arr[x];
                    arr[x] = arr[x - 1];
                    arr[x - 1] = t;
                    swapped = true;
                }
            }

            System.out.println(Arrays.toString(arr));
        } while (swapped);
    }

    public static void main(String[] args) {

        int a[] = {2, 21, 27, 35, 10, 25, 47, 45, 37, 19, 15, 50, 16, 12, 0, 42, 44, 6, 20, 9};

        bubbleSort(a);
    }
}
