import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PrintLines {

    public static void main(String[] args) throws FileNotFoundException {

        String line;
        Scanner inFile = new Scanner(new FileReader("quotes.txt"));

        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            System.out.println(line);
        }
        inFile.close();
    }
}
