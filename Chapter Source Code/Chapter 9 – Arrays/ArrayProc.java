import java.util.Scanner;

public class ArrayProc {

    static Scanner kb = new Scanner(System.in);

    /**
     * Print the array contents.
     *
     * @param a array of ints.
     */
    public static void printArray(int[] a) {
        int x, len = a.length;
        for (x = 0; x < len; x++)
            System.out.printf("Value at index %d is %d%n", x, a[x]);
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int len, x, sum=0;
        double avg;

        len = array.length;

        // initialize the array to random numbers.
        for (x = 0; x < len; x++)
            array[x] = (int) (Math.random() * 100 + 1);

        // display array contents.
        printArray(array);

        // read data into array.
        for (x = 0; x < len; x++) {
            System.out.print("Enter value for array[" + x + "]: ");
            array[x] = kb.nextInt();
        }

        // display array contents.
        printArray(array);

        // sum the array and calculate the average.
        for (x = 0; x < len; x++)
            sum = sum + array[x];

        avg = (double)sum / len;

        System.out.printf("The average of the entered values is %.2f%n", avg);
    }
}
