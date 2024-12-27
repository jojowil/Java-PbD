import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Project5a {
    public static void main(String[] args) throws FileNotFoundException {
        String line, word;
        int count = 0, total = 0;
        Scanner inFile = new Scanner(new FileReader("input.txt")), sline;
        PrintWriter outFile = new PrintWriter("output.txt");

        while (inFile.hasNext()) {
            line = inFile.nextLine();

            sline = new Scanner(line);
            for (count = 0; sline.hasNext(); count++) {
                word = sline.next();
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                outFile.print(word + " ");
            }
            total += count;
            outFile.println();
        }
        outFile.close();
        inFile.close();
        System.out.println("Total words is " + total);
    }
}