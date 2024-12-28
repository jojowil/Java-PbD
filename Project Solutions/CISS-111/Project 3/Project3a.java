import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project3a {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        Scanner inFile = new Scanner(new FileReader(args[0]));
        PrintWriter outFile = new PrintWriter(args[1]);
        int[] bitmap = new int[250000];
        int byt, bit, pnum;

        while (inFile.hasNextInt()) {
            pnum = inFile.nextInt() - 2000000;
            byt = pnum / 32;
            bit = pnum % 32;

            bitmap[byt] = bitmap[byt] | (0x80000000 >>> bit);
//	 System.out.printf("%d %d %d %x%n", pnum, byt, bit, bitmap[byt]);
        }

        int numbers = 0;
        for (byt = 0; byt < bitmap.length; byt++) {
            for (bit = 0; bit < 32; bit ++)
                if ( ((0x80000000 >>> bit ) & bitmap[byt]) != 0 ) {
                    outFile.println(byt*32 + bit + 2000000);
                    //numbers++;
                }
            numbers += countSetBits(bitmap[byt]);
        }
        System.out.println("Wrote " + numbers + " phone numbers.");
        outFile.close();
    }

    /**
     * Kernighan model to count 1 bits.
     * @param n value to be tested (can be negative)
     * @return 1-bit count
     */
    public static int countSetBits(int n){
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    /**
     * Another model to count 1 bits as they're rotated out.
     * @param value value to be tested
     * @return 1-bit count
     */
    int countOneBits(int value) {
        int count = 0;
        while (value) {
            count += value & 1;
            value >>= 1;
        }
        return count;
    }
}
