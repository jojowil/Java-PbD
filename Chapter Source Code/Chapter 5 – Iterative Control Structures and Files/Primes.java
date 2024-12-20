public class Primes {

    public static void main(String[] args) {

        int number, range;
        boolean prime;

        for ( number = 2; number <= 100; number++) {
            if ( number % 2 != 0 )
                prime = true;
            else
                prime = false;

            for ( range = 3; prime && range < number; range = range + 2 ) {
                if ( number % range == 0 )
                    prime = false;
            }

            if ( prime )
                System.out.println(number);
        }
    }
}
