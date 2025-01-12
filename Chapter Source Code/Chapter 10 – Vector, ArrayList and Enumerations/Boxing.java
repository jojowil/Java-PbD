public class Boxing {

    public static void main(String[] args) {

        int x, y;
        Integer xobj, yobj;

        // Simple primitive types
        x = 10;
        y = 15;
        // int vars boxed to Integer and toString() invoked.
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("x * y = " + x * y + "\n");

        // int vars are boxed to Integer
        xobj = x;
        yobj = y;
        // toString() invoked
        System.out.println("xobj is " + xobj);
        System.out.println("yobj is " + yobj);
        // intValue() invoked. * op has precedence.
        System.out.println("xobj * yobj = " + xobj * yobj + "\n");
    }
}
