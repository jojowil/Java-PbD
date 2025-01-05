import java.util.Arrays;

public class Median {

    public static void main(String[] args) {

        int a[] = {7,6,2,5,0,4};
        double median;

        Arrays.sort(a);
        int l = a.length;

        if ( l % 2 == 1 )
            median = a[l / 2];
        else
            median = (a[l / 2 - 1] + a[l / 2]) / 2.0;

        System.out.println("The median is " + median);

    }
}
