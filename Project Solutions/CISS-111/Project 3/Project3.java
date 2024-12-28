import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        Scanner inFile = new Scanner(new FileReader(args[0]));
        PrintWriter outFile = new PrintWriter(args[1]);
        byte[] bitmap = new byte[1000000];
        int byt, bit, pnum;

        while (inFile.hasNextInt()) {
            pnum = inFile.nextInt() - 2000000;
            byt = pnum / 8;
            bit = pnum % 8;

            bitmap[byt] = (byte)(bitmap[byt] | (0x80 >>> bit));
//	 System.out.printf("%d %d %d %x%n", pnum, byt, bit, bitmap[byt]);
        }

        for (byt = 0; byt < bitmap.length; byt++)
            for (bit = 0; bit < 8; bit ++)
                if ( ((byte)(0x80 >>> bit ) & bitmap[byt]) != 0 )
                    outFile.println(byt*8 + bit + 2000000);

        outFile.close();
    }
}
