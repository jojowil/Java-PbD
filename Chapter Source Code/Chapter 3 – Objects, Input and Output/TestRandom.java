import java.util.Random;

public class TestRandom {

    public static void main(String[] args) {

        int d6, x;
        Random rnd = new Random();  // create new Random object

        // like Scanner we can use nextDouble() and nextInt()
        System.out.println("rnd.nextDouble() is " + rnd.nextDouble());

        // six sided die roll.
        d6 = rnd.nextInt(6) + 1;
        System.out.println("d6 is " + d6);

        // uses nextInt(48) to replace (int)(Math.random() * 48)
        x = rnd.nextInt(48) + 45;
        System.out.println("x is " + x);

    }

}
