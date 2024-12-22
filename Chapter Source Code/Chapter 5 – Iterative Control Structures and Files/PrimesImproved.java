public class PrimesImproved {

    public static void main(String[] args) {

        int number, range;
        boolean prime;

        // looking at only odd numbers
        for ( number = 3; number <= 97; number = number + 2) {
            // always assume it's prime.
            prime = true;

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
