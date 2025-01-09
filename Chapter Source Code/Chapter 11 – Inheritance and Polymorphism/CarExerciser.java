public class CarExerciser {

    public static void main (String[] args) {

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
