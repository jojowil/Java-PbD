public class PersonRecord2 {

    public record Person (String givenName, String surname, int age) {
        @Override
        public String toString() {
            return givenName + " " + surname + ". Age " + age + ".";
        }
    }

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
