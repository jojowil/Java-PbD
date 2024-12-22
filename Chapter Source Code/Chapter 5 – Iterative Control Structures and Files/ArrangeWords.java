import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ArrangeWords {

    public static void main(String[] args) throws FileNotFoundException {

        String word;
        int words = 0, lines = 0;
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));

        // EOF loop to read one word at a time.
        while ( inFile.hasNext() ) {
            word = inFile.next();
            System.out.print(word + " ");
            words++;

            // have 5 words been printed?
            if ( words > 0 && words % 5 == 0 ) {
                System.out.println();
                lines++;

                // ok, have 5 lines been printed?
                if (lines % 5 == 0)
                    System.out.println();
            }
        }
        inFile.close();
    }
}
