import java.util.Scanner;

public class Commands1 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String line;

        // Display the prompt, loop until EOF.
        System.out.print("cmd> ");
        while (kb.hasNext()) {
            line = kb.nextLine();
            System.out.print("cmd> ");
        }
    }
}