public class Car {

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
