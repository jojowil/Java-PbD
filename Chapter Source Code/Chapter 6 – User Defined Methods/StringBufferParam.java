public class StringBufferParam {
    public static void alterstring(StringBuffer str) {
        // Replace characters of existing object.
        str.replace(0, str.length(), "String from alterstring() method!");

        System.out.println("str = " + str);
    }

    public static void main(String[] args) {
        StringBuffer s;

        // Must use constructor
        s = new StringBuffer("String from main() method.");
        System.out.println("s = " + s);

        alterstring(s);

        System.out.println("s = " + s);
    }
}
