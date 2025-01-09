import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class MethodObject {

    public static void checkType(List<?> l) {

        // use instanceof to determine type.
        if ( l instanceof Vector )
            System.out.print("Vector has size " + l.size() + " and capacity " + ((Vector)l).capacity());
        else if ( l instanceof ArrayList )
            System.out.print("ArrayList has size " + l.size() + " and unknown capacity");
        else
            System.out.print("Cannot use " + l.getClass());

        System.out.println(" with contents " + l);
    }

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>(20);
        ArrayList<Integer> a = new ArrayList<>(20);
        LinkedList<Integer> ll = new LinkedList<>();

        v.add(36);
        v.add(42);
        checkType(v);

        a.add(36);
        a.add(42);
        checkType(a);

        ll.add(36);
        ll.add(42);
        checkType(ll);
    }
}
