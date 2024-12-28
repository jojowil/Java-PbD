package project4;

import java.util.Vector;
public class Dish implements IceCream {

    protected Vector<Confection> scoops;

    public Dish () {
        scoops = new Vector<>();
    }

    public void add(Confection c) {
        if ( scoops.size() < 2 )
            scoops.add(c);
        else
            System.out.println("A Dish may only have 2 scoops maximum.");
    }

    public void add(Toppings t) {
        System.out.println("A Dish cannot have toppings. Perhaps you want a Sundae?");
    }

    @Override
    public String toString() {
        String s = "Dish with " + scoops.size() + " scoops:";
        for (Confection c : scoops)
            s = s + c + " ";
        return s;
    }
}