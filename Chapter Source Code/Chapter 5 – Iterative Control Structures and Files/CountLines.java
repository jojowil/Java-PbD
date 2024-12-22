import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CountLines {

    public static void main(String[] args) throws FileNotFoundException {
        String line;
        int count = 0;
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));

        // EOF loop to read and count lines.
        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            count++;
        }
        inFile.close();
        System.out.println("Number of lines is " + count);
    }
}
