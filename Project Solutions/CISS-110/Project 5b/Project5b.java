import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Project5b {
    public static void main(String[] args) throws FileNotFoundException {
        String word, rev;
        int x, total = 0;
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        PrintWriter outFile = new PrintWriter("output.txt");

        while (inFile.hasNext()) {
            word = inFile.next().toUpperCase();
            rev = "";
            for (x = word.length() - 1; x >= 0; x--) {
                rev += word.charAt(x);
            }
            outFile.println(rev);
            total++;
        }
        outFile.close();
        inFile.close();
        System.out.println("Total words is " + total);
    }
}