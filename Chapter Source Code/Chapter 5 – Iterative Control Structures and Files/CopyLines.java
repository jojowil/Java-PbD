import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CopyLines {

    public static void main(String[] args) throws FileNotFoundException {
        String line;
        // setup input and output files.
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));
        PrintWriter outFile = new PrintWriter("copy.txt");

        // EOF loop to read from one file and write to the other.
        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            outFile.println(line);
        }
        // close files. Output is NOT flushed without a close()!
        outFile.close();
        inFile.close();
    }
}
