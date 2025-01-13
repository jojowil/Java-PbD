class Car {

    private String color;
    private int doors;
    private boolean hatchback;
    protected String make;

    /**
     * One constructor to specify certain features.
     *
     * @param make      String value for make
     * @param doors     an int number of doors
     * @param hatchback indicating if it's a hatchback
     */
    public Car(String make, int doors, boolean hatchback) {
        this.make = make;
        this.doors = doors;
        this.hatchback = hatchback;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public boolean getHatchback() {
        return hatchback;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        String hb = hatchback ? " with hatchback." : ".";
        return make + " " + doors + " door" + hb;
    }
}

class Honda extends Car {

    public enum pkg_type {LX, EX, SE, EX_L, SPORT, TOURING}

    public enum eng_type {InLine4Cylinder, V6}

    public enum model_type {Accord, Civic, Fit, CR_V, Odyssey}

    private pkg_type pkg;
    private eng_type engine;
    private model_type model;
    private int year;

    /**
     * One constrcutor for Hondas.
     *
     * @param color     String value for color
     * @param doors     number of doors
     * @param hatchback do we have a hatchback?
     * @param model     enum for the model
     */
    public Honda(String color, int doors, boolean hatchback, model_type model) {
        // Car wants make, doors and hatchback - in that order!
        super("Honda", doors, hatchback);

        this.model = model;
        //this.color = color; // NO NO NO!
        setColor(color);
    }

    public model_type getModel() {
        return model;
    }

    public void setEngine(eng_type engine) {
        this.engine = engine;
    }

    public eng_type getEngine() {
        return engine;
    }

    public void setPkg(pkg_type p) {
        pkg = p;
    }

    @Override
    public String toString() {
        String hb = getHatchback() ? " with hatchback." : ".";
        return make + " " + model + " " + pkg + " " + getEngine() + " " + getDoors() + " door" + hb;
    }
}

public class CarExerciser {

    public static void main(String[] args) {

        Car somecar = new Car("Acura", 4, true), othercar;
        Honda hondacar = new Honda("Silver", 4, true, Honda.model_type.Fit);

        hondacar.setPkg(Honda.pkg_type.SPORT);
        hondacar.setEngine(Honda.eng_type.InLine4Cylinder);

        System.out.println(somecar);
        System.out.println(hondacar);

        // same types
        othercar = somecar;
        System.out.println(othercar);

        // polymorphism (Car references Honda)
        othercar = hondacar;
        // Late-binding
        System.out.println(othercar);
    }
}
