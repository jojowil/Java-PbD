import java.util.Arrays;

public class Mode {

    public static void main(String[] args) {

        int x, a[] = {4, 5, 7, 8, 4, 3, 2, 8, 7, 4, 5, 7, 9, 0, 1, 2, 6, 7, 8};
        int cur, ccount, mode = 0, mcount = 0;

        Arrays.sort(a);
        int l = a.length;

        // NOTE: This code does NOT handle bi-modal or multi-modal data!

        cur = a[0];
        ccount = 1;

        for (x = 1; x < l; x++) {
            //System.out.println(cur + " " + a[x]);
            if (cur == a[x]) {
                ccount++;
            } else {
                //System.out.println(cur + " appeared " + ccount + " times.");

                // set the new mode?
                if (ccount > mcount) {
                    mode = cur;
                    mcount = ccount;
                }
                // Always!
                ccount = 1;
                cur = a[x];
            }
        }
        System.out.println("The mode is " + mode);
    }
}
