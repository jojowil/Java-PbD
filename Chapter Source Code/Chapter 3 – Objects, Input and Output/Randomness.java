public class Randomness {

    public static void main(String[] args) {
        double r;

        // get number in the range 0 to <1.0.
        r = Math.random();

        System.out.println("r is " + r + "\n");
        System.out.println(r * 4 + 1);   // 0 -> ~3.9 plus 1
        System.out.println(r * 6 + 1);   // 0 -> ~5.9 plus 1
        System.out.println(r * 8 + 1);   //
        System.out.println(r * 10 + 1);  // ...
        System.out.println(r * 12 + 1);  //
        System.out.println(r * 20 + 1);  // 0 -> ~19.9 plus 1
    }
}
