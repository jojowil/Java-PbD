package hvcc.ciss111;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Vector;
import java.util.HashMap;
import static hvcc.ciss111.TokenType.*;

public class Project2 {
    public record Token (TokenType type, String value) {
        @Override
        public String toString() {
            return "Token type " + type + (value==null ? "" : ", value = " + value);
        }
    }
    private static boolean numMatch(String n) {
        return n.matches("#?\\$\\p{XDigit}{2}(?:\\p{XDigit}{2})?");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("program.asm"));
        Vector<Token> tokens = new Vector<>();
        HashMap<String, TokenType> opcodes = new HashMap<>();
        TokenType[] list = TokenType.values();
        TokenType tt;

        for ( int x = 0; x < list.length ; x++ )
            opcodes.put(list[x].name(), list[x]);

        while (inFile.hasNext()) {
            String line = inFile.nextLine();

            for (String p : line.split("\\s")) {
                switch (p) {
                    case "," -> tokens.add(new Token(COMMA, null));
                    case "(" -> tokens.add(new Token(LPAREN, null));
                    case ")" -> tokens.add(new Token(RPAREN, null));
                    case "X", "Y", "A" -> tokens.add(new Token(REGISTER, p));
                    default -> {
                        if (numMatch(p))
                            if (p.charAt(0) == '#')
                                tokens.add(new Token(CONST, p));
                            else
                                tokens.add(new Token(ADDRESS, p));
                        else if ( (tt = opcodes.get(p)) != null )
                            tokens.add(new Token(tt, null));
                    }
                }
            }
        }
        for ( Token t : tokens )
            System.out.println(t);
    }
}