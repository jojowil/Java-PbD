import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String line, word;
        int count = 0, words = 0, totalWords=0;
        Scanner inFile = new Scanner(new FileReader("quotes.txt")), lineScanner;

        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            System.out.println(line);
            count++;

            lineScanner = new Scanner(line);
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
