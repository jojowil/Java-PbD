import java.util.Scanner;

public class Commands2a {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String line, cmd;
        int space;

        System.out.print("cmd> ");
        while (kb.hasNext()) {
            line = kb.nextLine();

            // look for a space
            space = line.indexOf(' ');
            if ( space != -1 ) {
                cmd = line.substring(0, space);
            } else
                cmd = line;
            System.out.println("The command is: " + cmd);

            System.out.print("cmd> ");
        }
    }
}