import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;

public class Lists {
    public static void main(String[] args) {
        List<String> l;

        l = new Vector<String>( Arrays.asList("red", "bed", "led"));
        System.out.println(l);

        l = new ArrayList<String>( Arrays.asList("abc", "def", "ghi"));
        System.out.println(l);
    }
}
