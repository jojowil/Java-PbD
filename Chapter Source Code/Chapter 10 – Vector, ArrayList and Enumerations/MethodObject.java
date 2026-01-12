import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class MethodObject {

    /**
     * Check the type of List
     *
     * @param list unbounded List type
     */
    public static void checkType(List<?> list) {
        // use instanceof to determine type.
        if (list instanceof Vector)
            System.out.print("Vector has size " + list.size() + " and capacity " + ((Vector) list).capacity());
        else if (list instanceof ArrayList)
            System.out.print("ArrayList has size " + list.size() + " and unknown capacity");
        else
            System.out.print("Cannot use " + list.getClass());

        System.out.println(" with contents " + list);
    }

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(20);
        ArrayList<Integer> a = new ArrayList<>(20);
        LinkedList<Integer> l = new LinkedList<>();

        v.add(36);
        v.add(42);
        checkType(v);

        a.add(36);
        a.add(42);
        checkType(a);

        l.add(36);
        l.add(42);
        checkType(l);
    }
}
