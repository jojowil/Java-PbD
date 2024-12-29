import java.util.Scanner;

public class Commands2b {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        String line, cmd;
        int space, start;

        System.out.print("cmd> ");
        line = kb.nextLine();

        space = line.indexOf(' ');

        // whole line is my command!
        if ( space == -1 )
            System.out.println(line);
            // command plus arguments!
        else {
            System.out.println(line.substring(0,space));
            start = space + 1;
            space = line.indexOf(' ', start);
            while (space != -1) {
                System.out.println(line.substring(start, space));
                start = space + 1;
                space = line.indexOf(' ', start);
            }
            System.out.println(line.substring(start));
        }

    }
}