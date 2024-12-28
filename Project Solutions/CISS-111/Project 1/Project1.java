public class Project1 {
    public static void main(String[] args) {
        String number;
        int x, pos, radix;

        // test with "a3b:10 445 101:2 16:16"
        for ( x = 0; x < args.length; x++) {
            pos = args[x].indexOf(':');
            if ( pos == -1 ) {
                System.out.printf("No colon found in \"%s\"%n",args[x]);
            }
            else {
                number = args[x].substring(0, pos);
                try {
                    radix = Integer.parseInt(args[x].substring(pos + 1));
                    System.out.printf("%s base %s is %d base 10\n", number,
                            radix, Integer.parseInt(number, radix));
                }
                catch (NumberFormatException e) {
                    System.out.printf("The argument \"%s\" cannot be converted.%n",
                            args[x]);
                }

            }
        }
    }
}
