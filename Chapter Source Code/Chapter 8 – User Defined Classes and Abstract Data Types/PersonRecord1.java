public class PersonRecord1 {

    /**
     * Person as a record. all fields are immutable.
     *
     * @param givenName first name as a string
     * @param surname last name as a string
     * @param age age as an int
     */
    public record Person (String givenName, String surname, int age) { }

    public static void main(String[] args) {

        String gn, sn;
        int a;
        Person first = new Person("Bob", "Stevens", 54);

        gn = first.givenName();
        sn = first.surname();
        a = first.age();

        System.out.println(first + "\n");

        System.out.println("givenName = " + gn + "\nsurname = " + sn + "\nage = " + a);
    }
}
