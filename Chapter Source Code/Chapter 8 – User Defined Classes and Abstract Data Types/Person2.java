public class Person2 {
    private String givenName;
    private String surname;
    private int age;

    /**
     * Person constructor - no args
     */
    public Person2() {
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
    public Person2(String g, String s, int a) {
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
     * sets the given name
     *
     * @param s given name as a string
     * @return this object
     */
    public Person2 setGivenName(String s) {
        givenName = s;
        return this;
    }

    /**
     * sets the surname
     *
     * @param s surname as a string
     * @return this object
     */
    public Person2 setSurname(String s) {
        surname = s;
        return this;
    }

    /**
     * set the age
     *
     * @param y age as an int
     * @return this object
     */
    public Person2 setAge(int y) {
        age = y;
        return this;
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
    public boolean equals(Person2 otherPerson) {
        return ((age == otherPerson.age) &&
                (givenName.compareToIgnoreCase(otherPerson.givenName) == 0) &&
                (surname.compareToIgnoreCase(otherPerson.surname) == 0));
    }

    /**
     * become the other person by copying their details
     *
     * @param otherPerson object to become
     */
    public void makeCopy(Person2 otherPerson) {
        givenName = otherPerson.givenName;
        surname = otherPerson.surname;
        age = otherPerson.age;
    }

    /**
     * make a clone of this
     *
     * @return Person object as a copy of this
     */
    public Person2 getCopy() {
        return new Person2(givenName, surname, age);
    }

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
        Person2 firstPerson;
        Person2 secondPerson;
        Person2 thirdPerson;

        // second person is initialized in the constructor
        secondPerson = new Person2("Bob", "Smith", 36);

        // set values for firstperson
        firstPerson = new Person2()
                .setGivenName("Karen")
                .setSurname("Parson")
                .setAge(43);

        System.out.println("secondPerson.getGivenName = " + secondPerson.getGivenName());
        System.out.println("firstPerson.getSurname = " + firstPerson.getSurname());

        // test toString
        System.out.println("\nfirstPerson  -> " + firstPerson);
        System.out.println("secondPerson -> " + secondPerson);

        // make new object using firstPerson contents
        thirdPerson = firstPerson.getCopy();
        System.out.println("\nthirdPerson  -> " + thirdPerson);

        // replacce contents of existing object with secondPerson contents.
        firstPerson.makeCopy(secondPerson);
        System.out.println("firstPerson  -> " + firstPerson);
    }
}
