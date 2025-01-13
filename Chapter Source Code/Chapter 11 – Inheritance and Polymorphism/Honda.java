public class Honda extends Car {

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
