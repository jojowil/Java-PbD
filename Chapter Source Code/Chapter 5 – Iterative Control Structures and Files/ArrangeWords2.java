import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class ArrangeWords2 {

    public static void main(String[] args) throws FileNotFoundException {
        String word;
        int count = 0, lines = 0, size;
        ArrayList<String> allWords = new ArrayList<>();
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));

        // read each word and add to ArrayList
        while ( inFile.hasNext() ) {
            word = inFile.next();
            allWords.add(word);
            count++;
        }
        inFile.close();
        System.out.println("Number of words is " + count);

        // This prints all the words in the array list and the size.
        System.out.println(allWords);
        size = allWords.size();
        System.out.println(size);

        // iterate over the collected words.
        for (int x = 0; x < size; x++) {
            System.out.print(allWords.get(x) + " ");

            // have 5 words been printed?
            if ( x > 0 && x % 5 == 0 ) {
                System.out.println();
                lines++;

                // ok, have 5 lines been printed?
                if (lines % 5 == 0)
                    System.out.println();
            }
        }
    }
}
