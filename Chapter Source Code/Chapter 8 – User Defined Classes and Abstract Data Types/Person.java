public class Person {
    private String givenName;
    private String surname;
    private int age;

    public Person() {
        givenName = "";
        surname = "";
        age = 0;
    }

    public Person(String g, String s, int a) {
        givenName = g;
        surname = s;
        age = a;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setGivenName(String s) {
        givenName = s;
    }

    public void setSurname(String s) {
        surname = s;
    }

    public void setAge(int y) {
        age = y;
    }

    public void incAge() {
        ++age;
    }

    public boolean equals(Person otherPerson) {
        return ( ( age == otherPerson.age) &&
                ( givenName.compareToIgnoreCase(otherPerson.givenName) == 0 ) &&
                ( surname.compareToIgnoreCase(otherPerson.surname) == 0 ) );
    }

    public void makeCopy(Person otherPerson) {
        givenName = otherPerson.givenName;
        surname = otherPerson.surname;
        age = otherPerson.age;
    }

    public Person getCopy() {
        Person temp = new Person(givenName, surname, age);

        return temp;
    }

    @Override
    public String toString() {
        return givenName + " " + surname + ". Age " + age + ".";
    }
}
