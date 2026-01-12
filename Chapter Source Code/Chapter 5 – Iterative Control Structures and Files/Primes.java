public class Primes {

    public static void main(String[] args) {
        int number, range;
        boolean prime;

        // looking for primes between 2 and 100.
        for ( number = 2; number <= 100; number++) {
            // dividible by 2?
            if ( number % 2 != 0 )
                prime = true;
            else
                prime = false;

            // divisible by other odd values?
            for ( range = 3; prime && range < number; range = range + 2 ) {
                if ( number % range == 0 )
                    prime = false;
            }

            if ( prime )
                System.out.println(number);
        }
    }
}
