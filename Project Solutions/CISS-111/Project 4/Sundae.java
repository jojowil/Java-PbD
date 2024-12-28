package project4;

import java.util.Vector;

public class Sundae extends Dish{

    private Vector<Toppings> toppings;

    public Sundae () {
        super();
        toppings = new Vector<Toppings>();
    }

    @Override
    public void add(Toppings t) {
        if ( toppings.size() < 3 )
            toppings.add(t);
        else
            System.out.println("A Sundae may only have 3 toppings maximum.");
    }

    @Override
    public void add(Confection c) {
        if ( scoops.size() < 5 )
            scoops.add(c);
        else
            System.out.println("A Sundae may only have 5 scoops maximum.");
    }

    @Override
    public String toString() {
        String s = "Sundae with " + scoops.size() + " scoops:";
        for (Confection c : scoops)
            s += c + " ";
        s += " and " + toppings.size() + " toppings: ";
        for (Toppings t : toppings)
            s += t + " ";
        return s;
    }
}
