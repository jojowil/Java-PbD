import java.util.Scanner;

public class Project4b {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int add, ch, x;
        String word, cword = "";

        System.out.print("Enter a word to be enciphered: ");
        word = kb.nextLine().toUpperCase();

        System.out.print("Enter a whole number additive: ");
        add = kb.nextInt();

        if (add < 1 || add > 25)
            System.out.println("The additive must be between 1 and 25, inclusive.");
        else {
            for (x = 0; x < word.length(); x++) {
                ch = word.charAt(x) + add;
                if (ch > 'Z')
                    ch = 64 + (ch - 'Z');
                cword += (char) ch;
            }
            System.out.println("The enciphered word is:\n" + cword);
        }
    }
}