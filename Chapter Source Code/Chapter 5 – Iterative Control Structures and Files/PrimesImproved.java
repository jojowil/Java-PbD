public class PrimesImproved {

    public static void main(String[] args) {

        int number, range;
        boolean prime;

        for ( number = 3; number <= 97; number = number + 2) {
            prime = true;

            for ( range = 3; prime && range < number; range = range + 2 ) {
                if ( number % range == 0 )
                    prime = false;
            }

            if ( prime )
                System.out.println(number);
        }
    }
}
