import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String line, word;
        int count = 0, words = 0, totalWords=0;
        Scanner inFile = new Scanner(new FileReader("quotes.txt")), lineScanner;

        // EOF loop to read lines.
        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            System.out.println(line);
            count++;

            // Scanner for the line to read words in the String.
            lineScanner = new Scanner(line);
            // for loop to count words as they're read from the line.
            for (words = 0; lineScanner.hasNext(); words++) {
                word = lineScanner.next();
                System.out.println(word);
            }
            lineScanner.close();
            System.out.println("Words in this line is " + words);
            totalWords += words;
        }
        inFile.close();
        System.out.println("Total number of lines is " + count);
        System.out.println("Total number of words is " + totalWords);
    }
}
