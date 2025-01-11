public class StringParam {

    /**
     * Method demonstrating pass by value.
     * And String is immutable, so cannot be changed
     *
     * @param str
     */
    public static void alterString(String str) {
        // Creates new instance. Does not replace
        // characters of existing object.
        str = "String from alterstring() method!";

        System.out.println("str = " + str);
    }

    public static void main(String[] args) {
        String s;

        s = "String from main() method.";
        System.out.println("s = " + s);
        alterString(s);
        System.out.println("s = " + s);
    }
}
