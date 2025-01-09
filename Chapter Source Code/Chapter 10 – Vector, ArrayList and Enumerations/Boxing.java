public class Boxing {

    public static void main(String[] args) {

        int x, y;
        Integer xobj, yobj;

        // Simple primitive types
        x = 10;
        y = 15;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("x * y = " + x * y);
        System.out.println();

        // Wrappers required prior to JDK 5.0
        xobj = new Integer(100);
        yobj = new Integer(150);
        System.out.println("xobj is " + xobj);
        System.out.println("yobj is " + yobj);
        System.out.println("xobj * yobj = " +
                xobj.intValue() * yobj.intValue());
        System.out.println();

        // Wrappers with JDK 5.0 and later
        // Autoboxing
        xobj = 1000;
        yobj = 1500;
        // Auto-unboxing.
        System.out.println("xobj is " + xobj);
        System.out.println("yobj is " + yobj);
        System.out.println("xobj * yobj = " + xobj * yobj);
        System.out.println();

    }
}
