public class GenMethod {

    @SafeVarargs //For JDK 7 and higher
    public static <T> void display(T ... items) {
        for (T x: items)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Time clock1, clock2;
        int x=10, y=15;
        Integer[] ia={1,2,3,4,5};

        clock1 = new Time(11, 57, 0); // 11:57:00am
        clock2 = new Time(14, 0, 0); // 2:00:00pm

        System.out.print("x = ");
        display(x);

        System.out.print("y = ");
        display(y);

        System.out.print("x & y = ");
        display(x, y);

        System.out.print("ia = ");
        display(ia);

        System.out.print("clock1 & clock2 = ");
        display(clock1, clock2);
    }
}
