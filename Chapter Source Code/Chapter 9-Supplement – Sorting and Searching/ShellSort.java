public class ShellSort {

    public static void shellSort(int[] arr) {

        int x, y, t, gap, swaps=0;

        for ( gap = arr.length/2; gap > 0; gap=gap/2 ) {

            swaps = 0;
            for ( x = gap; x < arr.length; x++ ) {
                t = arr[x];
                for ( y = x; y >= gap && arr[y-gap] > t; y=y-gap ) {
                    arr[y] = arr[y-gap];
                    swaps++;
                    //print_debug(arr, gap, swaps);
                }

                arr[y] = t;
            }
            print_debug(arr, gap, swaps);
        }
    }

    public static void print_debug(int[] a, int g, int s){

        if ( g == 0 && s == 0 )
            System.out.print("                arr=");
        else
            System.out.printf("gap=%2d swaps=%2d arr=", g, s);
        for (int i = 0; i < a.length; i++)
            System.out.printf("%3d", a[i]);
        System.out.println();
    }

    public static void main(String[] args) {

        int x, a[] = {2, 21, 27, 35, 10, 25, 47, 45, 37, 19, 15, 50, 16, 12, 0, 42, 44, 6, 20, 9};

        print_debug(a, 0, 0);

        shellSort(a);

        print_debug(a, 0, 0);

    }
}
