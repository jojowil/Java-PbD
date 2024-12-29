import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Project7 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner infile = new Scanner(new FileReader(args[0]));

        while (infile.hasNext()) {
            String s = infile.nextLine();
            System.out.println(s + " = " + eval(s));
        }

        infile.close();
    }

    public static void apply(GenStack<Character> os, GenStack<Integer> vs) {

        int	v1, v2, r;
        char	op;

        op = os.pop();
        v2 = vs.pop();
        v1 = vs.pop();

        switch (op) {

            case '+':
                vs.push(v1 + v2);
                break;

            case '-':
                vs.push(v1 - v2);
                break;

            case '/':
                vs.push(v1 / v2);
                break;

            case '*':
                vs.push(v1 * v2);
                break;

            case '%':
                vs.push(v1 % v2);
                break;
        }
    }

    public static int eval(String s) {

        int	x=0, num;
        GenStack<Character> ostack = new GenStack<Character>();
        GenStack<Integer> vstack = new GenStack<Integer>();
        char c;

        while ( x < s.length()) {
            c = s.charAt(x);
            switch(c) {

                case '(':
                    ostack.push((char)c);
                    break;

                case ')':
                    while ( ostack.peek() != '(' )
                        apply(ostack, vstack);
                    ostack.pop();
                    break;

                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    num = 0;
                    while ( x < s.length() && Character.isDigit(c) ) {
                        num = num * 10 + (c - '0');
                        x++;
                        if ( x < s.length())
                            c = s.charAt(x);
                    }
                    x--;
                    vstack.push(num);
                    break;

                case '+', '-', '*', '/', '%':
                    if ( !ostack.isEmpty() )
                        while ( !ostack.isEmpty() && prec(ostack.peek()) >= prec(c))
                            apply(ostack, vstack);
                    ostack.push(c);
                    break;

                case ' ', '\t': break;
            }
            x++;
        }
        while ( ! ostack.isEmpty() )
            apply(ostack, vstack);

        return vstack.pop();
    }

    public static int prec (char c) {

        switch (c) {

            case '+', '-': return(0);
            case '*', '/', '%': return(1);
            case '(': return(-1);
        }

        return (-1);
    }

}

