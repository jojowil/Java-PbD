import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Commands4 {

    static Scanner kb = new Scanner(System.in);
    static String[] cmds = { "copy", "delete", "storage", "volume", "vserver", "help" };
    static ArrayList<String> clist = new ArrayList<>(Arrays.asList(cmds));

    public static void main(String[] args) {
        String line, cmd;
        String[] parts;

        System.out.print("cmd> ");
        while (kb.hasNext()) {

            line = kb.nextLine();
            // treat consecutive spaces as one.
            parts = line.split("\\s+");
            cmd = parts[0];

            // Is this a valid command?
            if ( clist.contains(cmd) ) {
                System.out.println("The command is: " + cmd);

                // Are there any arguments? What are they?
                if ( parts.length > 1 ) {
                    for (int x = 1; x < parts.length; x++)
                        System.out.println("Argument " + x + ": " + parts[x]);
                }
            } else {
                // Not a valid command.
                System.out.println("Error: " + cmd + " is not a valid command.");
            }

            System.out.print("cmd> ");
        }
    }
}