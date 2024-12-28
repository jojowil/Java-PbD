package project4;

public class Cone implements IceCream {

    private ConeType type;
    private Confection content = null;
    public Cone (ConeType ct) {
        type = ct;
    }

    public void add (Confection c) {
        if ( content == null )
            content = c;
        else
            System.out.println("project4.Cone already has " + content);
    }

    public void add (Toppings t) {
        System.out.println("A project4.Cone may not have toppings.");
    }

    @Override
    public String toString() {
        return type + " cone with " + content;
    }
}
