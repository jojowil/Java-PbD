import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class VectorObject {

    // A handful of enumerations
    public enum Coins {Penny, Nickel, Dime;}
    public enum Trees {Maple, Birch, Ash, Rowan;}
    public enum IceCream {RockyRoad, Vanilla, CrumbsAlongTheMohawk;}

    public static void main(String[] args) {
        List<Object> l;
        Vector<Object> v = new Vector<>();

        // l references the Vector. Although List is an interface,
        // it can be used to reference objects that implement it.
        l = v;

        // testing the instance type through polymorphism.
        if (l instanceof Vector)
            System.out.println("Vector");
        else if (l instanceof ArrayList)
            System.out.println("ArrayList");

        // We are invoking the add() method of the Vector through
        // late binding.
        l.add(Coins.Penny);
        l.add(Trees.Maple);
        l.add(IceCream.Vanilla);

        // Print the vector to show changes made with l.
        System.out.println(v);

        // Classify objects
        for (Object o : v)
            if (o instanceof Coins)
                System.out.println("The coin is " + o);
            else if (o instanceof Trees)
                System.out.println("The tree is " + o);
            else
                System.out.println("No idea!");
    }
}
