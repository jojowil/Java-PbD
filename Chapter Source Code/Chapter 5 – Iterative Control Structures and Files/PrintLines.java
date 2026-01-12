import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PrintLines {

    public static void main(String[] args) throws FileNotFoundException {
        String line;
        // Wrap scanner around the FileReader that opens the file.
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));

        // EOF loop
        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            System.out.println(line);
        }
        inFile.close();
    }
}
