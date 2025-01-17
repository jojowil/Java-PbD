public class Bounded {

    public static <T extends Comparable<T>> T min(T a, T b) {
        if (a.compareTo(b) < 0)
            return a;
        else
            return b;
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) >= 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        double f = 4.01, g = 3.14;
        String s = "ZZZ", t = "abd";

        System.out.println(min(a, b) + " is smaller than " + max(a, b));
        System.out.println(min(f, g) + " is smaller than " + max(f, g));
        System.out.println(min(s, t) + " is smaller than " + max(s, t));
    }
}
