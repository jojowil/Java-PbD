public class PersonRecord3 {

    /**
     * Person as a record, plus some visuals.
     *
     * @param givenName first name as a string
     * @param surname   last name as a string
     * @param age       age as an int
     */
    public record Person (String givenName, String surname, int age) { }

    public static void main(String[] args) {

        Person first, second;

        first = new Person("Bob", "Stevens", 54);
        second = new Person("Bob", "Stevens", 54);

        System.out.println("first.equals(second) = " + first.equals(second));

        // Here, we show their immutable nature in that they have
        // the same hashcode like String.
        System.out.println("first.hashCode() = " + first.hashCode());
        System.out.println("second.hashCode() = " + second.hashCode());
    }
}