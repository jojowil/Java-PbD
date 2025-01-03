import java.util.Scanner;

public class Array2DProc {

    static Scanner kb = new Scanner(System.in);

    public static void printArray2d(int[][] a) {
        int row, col;
        for (row = 0; row < a.length; row++) {
            System.out.print("Values in row " + row + ": ");
            for (col = 0; col < a[row].length; col++)
                System.out.printf("%3d ", a[row][col]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array;
        int row, col, x;
        double avg, sum;

        x = (int)(Math.random() * 9 + 2);
        System.out.println("\nCreating ragged array of " + x + " rows");
        System.out.println("Each row length between 2 and 10 integers.\n");

        // create x rows
        array = new int[x][];

        // create x columns for each row
        for (row = 0; row < array.length; row++) {
            // range 0 through 8 + 2 yields 2 through 10
            x = (int)(Math.random() * 9 + 2);
            System.out.println("Row " + row + " is " + x + " integers long.");
            array[row] = new int[x];
        }

        // initialize the array with random numbers.
        System.out.println("\nInitializaing each row with random numbers.");
        for (row = 0; row < array.length; row++)
            for (col = 0; col < array[row].length; col++)
                array[row][col] = (int) (Math.random() * 100 + 1);

        // display array contents.
        printArray2d(array);

        // sum the array and calculate the average.
        System.out.println("\nCalculating average of each row.");
        for (row = 0; row < array.length; row++) {
            sum = 0.0;
            for (col = 0; col < array[row].length; col++)
                sum = sum + array[row][col];
            avg = sum / array[row].length;

            System.out.printf("The average of row %d is %.2f\n",
                    row, avg);
        }
    }
}
