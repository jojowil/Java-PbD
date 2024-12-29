import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Project6 {

    public static void main (String[] args) throws FileNotFoundException {

        Scanner inFile;
        String word;
        StringHash wordList = new StringHash(4093);

        inFile = new Scanner(new FileReader("dictionary.txt"));

        while (inFile.hasNext()) {
            word = inFile.next();
            wordList.put(word);
        }
        inFile.close();

        inFile = new Scanner(new FileReader(args[0]));

        while ( inFile.hasNext() ) {
            word = inFile.next();
            word = removeNonLetDig(word);
            if ( word != null && ! wordList.get(word) )
                System.out.printf("%s\n", word);
        }

        inFile.close();
    }

    public static String removeNonLetDig(String s) {
        int b = 0, e = s.length()-1;

        // Trim from the beginning
        while (b <= e && !Character.isLetterOrDigit(s.charAt(b)))
            b++;

        // Trim from the end
        while (e >= b && !Character.isLetterOrDigit(s.charAt(e)))
            e--;

        if (b <= e)
            return s.substring(b,e + 1);
        else
            return null;
    }
}
