import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StressRandom {

    /**
     * We test a variety of intense random number generations.
     * nanoTime() is used to measure the realtime cost.
     * The actual time for each is pretty revealing.
     */

    public static void main(String[] args) {

        int x, n;
        long startTime, endTime, timeElapsed;
        Random rnd = new Random();

        /*
            Test 100M random ints on the Random() object.
         */
        startTime = System.nanoTime();
        for (x = 1 ; x <= 100000000 ; x++)
            n = rnd.nextInt(6) + 1;
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

        /*
            Test 100M random doubles on the Random() object.
         */
        startTime = System.nanoTime();
        for (x = 1 ; x <= 100000000 ; x++)
            n = (int)(rnd.nextDouble() * 6 + 1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

        /*
            Test 100M random ints with Math.random().
         */
        startTime = System.nanoTime();
        for (x = 1 ; x <= 100000000 ; x++)
            n = (int)(Math.random() * 6 + 1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

        /*
            Test 100M random ints on ThreadLocalRandom.
         */
        startTime = System.nanoTime();
        for (x = 1 ; x <= 100000000 ; x++)
            n = ThreadLocalRandom.current().nextInt(1, 7);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);
    }

}
