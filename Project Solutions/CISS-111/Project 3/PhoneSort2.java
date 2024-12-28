import java.io.*;
import java.util.*;

public class PhoneSort2 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        Scanner inFile = new Scanner(new FileReader(args[0]));
        PrintWriter outFile = new PrintWriter(args[1]);
        int[] phonelist = new int[4000000];
        int x, last;

        System.out.printf("Time before array pop = %d.\n",
                System.currentTimeMillis());
        x = 0;
        while (inFile.hasNext()) {
            phonelist[x] = Integer.parseInt(inFile.next());
            x++;
        }

        inFile.close();

        System.out.printf("Time before array sort = %d.\n",
                System.currentTimeMillis());
        Arrays.sort(phonelist);

        System.out.printf("Time before write = %d.\n",
                System.currentTimeMillis());
        last = 0;
        for (x = 0; x < phonelist.length; x++)
            if (last != phonelist[x]) {
                outFile.println(phonelist[x]);
                last = phonelist[x];
            }

        outFile.close();

        System.out.printf("Time after write = %d.\n",
                System.currentTimeMillis());
    }
}
