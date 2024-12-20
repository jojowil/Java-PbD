import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CopyLines {

    public static void main(String[] args) throws FileNotFoundException {

        String line;
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));
        PrintWriter outFile = new PrintWriter("copy.txt");

        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            outFile.println(line);
        }
        outFile.close();
        inFile.close();
    }
}
