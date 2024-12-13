public class Variables {

    public static void main (String[] args) {

        // declaring some ints and a double.
        int test1, test2, test3, sum;
        double average;

        // direct assignment of values
        test1 = 90;
        test2 = 85;
        test3 = 87;

        // sum assigned as the result of an expression.
        sum = test1 + test2 + test3;

        // calculate the average preserving precision.
        average = sum / 3.0;

        System.out.println("The average is " + average);
    }
}
