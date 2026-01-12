import java.util.Scanner;

public class Commands3 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String line, cmd;
        String[] parts;

        System.out.print("cmd> ");
        while (kb.hasNext()) {
            line = kb.nextLine();
            parts = line.split(" ");
            System.out.println("The command is: " + parts[0]);

            System.out.print("cmd> ");
        }
    }
}