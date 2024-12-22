public class Person2 {
    private String givenName;
    private String surname;
    private int age;

    public Person2() {
        givenName = "";
        surname = "";
        age = 0;
    }

    public Person2(String g, String s, int a) {
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

    public Person2 setGivenName(String s) {
        givenName = s;
        return this;
    }

    public Person2 setSurname(String s) {
        surname = s;
        return this;
    }

    public Person2 setAge(int y) {
        age = y;
        return this;
    }

    public void incAge() {
        ++age;
    }

    public boolean equals(Person2 otherPerson) {
        return ( ( age == otherPerson.age) &&
                ( givenName.compareToIgnoreCase(otherPerson.givenName) == 0 ) &&
                ( surname.compareToIgnoreCase(otherPerson.surname) == 0 ) );
    }

    public void makeCopy(Person2 otherPerson) {
        givenName = otherPerson.givenName;
        surname = otherPerson.surname;
        age = otherPerson.age;
    }

    public Person2 getCopy() {
        Person2 temp = new Person2(givenName, surname, age);

        return temp;
    }

    @Override
    public String toString() {
        return givenName + " " + surname + ". Age " + age + ".";
    }
}
