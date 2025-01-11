public class Mean {

    public static void main(String[] args) {

        int sum = 0, x, a[] = {7, 6, 2, 5, 0};
        double avg;

        for (x = 0; x < a.length; x++)
            sum += a[x];

        System.out.println("The sum is " + sum);
        avg = (double) sum / a.length;
        System.out.println("The mean is " + avg);
    }
}
