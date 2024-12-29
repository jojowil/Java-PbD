import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class CommandsLong {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        String line, cmd;
        int space;

        System.out.println("Welcome to my really awesome command line interface!");
        System.out.println("Type 'help' at any time for assistance. (v. 1.0)\n");

        System.out.print("cmd> ");
        while (kb.hasNext()) {

            line = kb.nextLine();

            // look for a space
            space = line.indexOf(' ');
            if ( space != -1 ) {
                cmd = line.substring(0, space);
            } else
                cmd = line;

            // Is this a valid command?
            if ( cmd.equals("copy")  ) {
                System.out.println("Performing the work of copy...");
                // do the copy command
            } else if ( cmd.equals("delete")  ) {
                System.out.println("Performing the work of delete...");
                // do the delete command
            } else if ( cmd.equals("storage") ) {
                System.out.println("Performing the work of storage...");
                // do the storage command
            } else if ( cmd.equals("volume") ) {
                System.out.println("Performing the work of volume...");
                // do the volume command
            } else if ( cmd.equals("vserver") ) {
                System.out.println("Performing the work of vserver...");
                // do the vserver command
            } else if ( cmd.equals("help") ) {
                System.out.println("Performing the work of help...");
                // do the help command
            } else {
                // Not a valid command.
                System.err.println("Error: " + cmd + " is not a valid command.");
            }

            System.out.print("cmd> ");
        }
    }
}