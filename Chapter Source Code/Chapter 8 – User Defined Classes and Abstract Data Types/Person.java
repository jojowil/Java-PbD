public class Person {
    private String givenName;
    private String surname;
    private int age;

    /**
     * Person constructor - no args
     */
    public Person() {
        givenName = "";
        surname = "";
        age = 0;
    }

    /**
     * Person constructor - 3 args
     *
     * @param g given name
     * @param s surname
     * @param a age
     */
    public Person(String g, String s, int a) {
        givenName = g;
        surname = s;
        age = a;
    }

    /**
     * get the given name
     *
     * @return String given name
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * get the surname
     *
     * @return String surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * get the age
     *
     * @return int age
     */
    public int getAge() {
        return age;
    }

    /**
     * set the given name
     *
     * @param s given name as a string
     */
    public void setGivenName(String s) {
        givenName = s;
    }

    /**
     * set the surname
     *
     * @param s surname as a string
     */
    public void setSurname(String s) {
        surname = s;
    }

    /**
     * set the age in years - no bounds check
     *
     * @param y years as int
     */
    public void setAge(int y) {
        age = y;
    }

    /**
     * incremenet the age
     */
    public void incAge() {
        ++age;
    }

    /**
     * comapres this object to other person
     *
     * @param otherPerson Person object to be tested
     * @return boolean equality
     */
    public boolean equals(Person otherPerson) {
        return ((age == otherPerson.age) &&
                (givenName.compareToIgnoreCase(otherPerson.givenName) == 0) &&
                (surname.compareToIgnoreCase(otherPerson.surname) == 0));
    }

    /**
     * become the other person by copying their details
     *
     * @param otherPerson object to become
     */
    public void makeCopy(Person otherPerson) {
        givenName = otherPerson.givenName;
        surname = otherPerson.surname;
        age = otherPerson.age;
    }

    /**
     * make a clone of this
     *
     * @return Person object as a copy of this
     */
    public Person getCopy() {
        return new Person(givenName, surname, age);
    }

    /**
     * replace toString
     *
     * @return String representation of this object
     */
    @Override
    public String toString() {
        return givenName + " " + surname + ". Age " + age + ".";
    }

    /**
     * built-in exerciser
     *
     * @param args from the command line
     */
    public static void main(String[] args) {
        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;

        firstPerson = new Person();
        // second person is initialized in the constructor
        secondPerson = new Person("Bob", "Smith", 36);

        // set values for firstperson
        firstPerson.setGivenName("Karen");
        firstPerson.setSurname("Parson");
        firstPerson.setAge(43);

        System.out.println("secondPerson.getGivenName() = " + secondPerson.getGivenName());
        System.out.println("firstPerson.getSurname() = " + firstPerson.getSurname());

        // test toString
        System.out.println("\nfirstPerson  -> " + firstPerson);
        System.out.println("secondPerson -> " + secondPerson);

        // make new object using firstPerson contents
        thirdPerson = firstPerson.getCopy();
        System.out.println("\nthirdPerson  -> " + thirdPerson);

        // replace contents of existing object with secondPerson contents.
        firstPerson.makeCopy(secondPerson);
        System.out.println("firstPerson  -> " + firstPerson);
    }
}
