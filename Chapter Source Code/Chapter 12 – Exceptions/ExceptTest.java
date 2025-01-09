import java.util.Scanner;

public class ExceptTest {

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {

        String s;
        int pos;
        System.out.println("\nEnter data with at least one colon:");

        while (kb.hasNext()) {
            try {
                s = kb.nextLine();
                pos = s.indexOf(":");
                if ( pos == -1 )
                    throw new DataFormatException();
                else
                    System.out.println("The value entered is " + s);
            }
            catch (DataFormatException dfeRef) {
                System.out.println(dfeRef);
            }
            catch (Exception eRef) {
                System.out.println(eRef);
            }
            System.out.println("\nEnter data with at least one colon:");
        }
    }
}
