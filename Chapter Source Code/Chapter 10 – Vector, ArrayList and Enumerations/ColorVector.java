import java.util.Vector;

public class ColorVector {

    public static void main(String[] args) {
        Vector<String> rainbow = new Vector<>();
        int x, len;

        rainbow.add("Orange");
        rainbow.add("Yellow");
        System.out.println(rainbow);

        // forgot about Red!
        rainbow.add(0, "Red");
        System.out.println(rainbow);

        rainbow.add("Blue");
        rainbow.add("Fuchsia");
        rainbow.add("Indigo");
        rainbow.add("Violet");
        System.out.println(rainbow);

        // whoops, no Fuchsia in the rainbow
        rainbow.remove("Fuchsia");
        // forgot about Green!
        rainbow.add(3, "Green");
        System.out.println(rainbow);

        System.out.println();
        len = rainbow.size();
        for (x = 0; x < len; x++)
            System.out.println("Value at index " + x + " is " + rainbow.get(x));

        System.out.println();
        for (String s : rainbow)
            System.out.println(s);
    }
}
