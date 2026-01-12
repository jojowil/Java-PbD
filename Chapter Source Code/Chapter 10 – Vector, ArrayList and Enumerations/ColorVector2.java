import java.util.Vector;

public class ColorVector2 {

    enum Color {Red, Orange, Yellow, Green, Blue, Indigo, Violet}

    public static void main(String[] args) {
        Vector<Color> rainbow = new Vector<>();
        int x, len;

        rainbow.add(Color.Orange);
        rainbow.add(Color.Yellow);
        System.out.println(rainbow);

        // forgot about Red!
        rainbow.add(0, Color.Red);
        System.out.println(rainbow);

        rainbow.add(Color.Blue);
        rainbow.add(Color.Indigo);
        rainbow.add(Color.Violet);
        System.out.println(rainbow);

        // forgot about Green!
        rainbow.add(3, Color.Green);
        System.out.println(rainbow);

        System.out.println();
        len = rainbow.size();
        for (x = 0; x < len; x++)
            System.out.println("Value at index " + x + " is " + rainbow.get(x));

        System.out.println();
        for (Color c : rainbow)
            System.out.println(c);
    }
}
