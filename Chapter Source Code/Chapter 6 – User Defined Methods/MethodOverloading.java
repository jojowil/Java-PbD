public class MethodOverloading {

    public static void print_error(String errstr) {
        System.err.printf("The program encountered a \"%s\" error.", errstr);
    }

    public static void print_error() {
        System.err.println("The program encountered an unknown error.");
    }

    public static int get_random() {
        return (int)(Math.random()*100 + 1);
    }

    public static int get_random(int top) {
        return (int)(Math.random()*top + 1);
    }

    public static void main(String[] args) {

        System.out.printf("%d%n", get_random());
        System.out.printf("%d%n", get_random(50));
        print_error();
        print_error("something terrible");

    }
}
