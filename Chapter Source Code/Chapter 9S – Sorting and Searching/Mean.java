public class Mean {

    public static void main(String[] args) {
        int sum = 0;
        int[] a = {7, 6, 2, 5, 0};
        double avg;

        for (int i : a) sum += i;

        System.out.println("The sum is " + sum);
        avg = (double) sum / a.length;
        System.out.println("The mean is " + avg);
    }
}
