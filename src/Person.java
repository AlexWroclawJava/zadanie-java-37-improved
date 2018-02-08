public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException();
        }
        if (firstName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NameUndefinedException();
        }
        if (lastName.length() <= 2) {
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "imię=" + firstName + '\n' +
                "nazwisko=" + lastName + '\n' +
                "wiek=" + age + '\n' +
                "pesel=" + pesel;
    }
}
