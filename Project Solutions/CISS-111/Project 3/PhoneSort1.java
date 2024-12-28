import java.io.*;
import java.util.*;

public class PhoneSort1 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        Scanner inFile = new Scanner(new FileReader(args[0]));
        PrintWriter outFile = new PrintWriter(args[1]);
        Vector<Integer> phonelist = new Vector<Integer>(4000000);
        int last;

        System.out.printf("Time before array pop = %d.\n",
                System.currentTimeMillis());
        while (inFile.hasNextInt()) {
            phonelist.addElement(inFile.nextInt());
        }

        inFile.close();

        System.out.printf("Time before array sort = %d.\n",
                System.currentTimeMillis());
        Collections.sort(phonelist);

        System.out.printf("Time before write = %d.\n",
                System.currentTimeMillis());
        last = 0;
        for (Integer x : phonelist)
            if (last != x) {
                outFile.println(x);
                last = x;
            }

        outFile.close();

        System.out.printf("Time after write = %d.\n",
                System.currentTimeMillis());
    }
}
