import java.util.InputMismatchException;

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

    public void setFirstName(String firstName) throws NameUndefinedException   {
        if (firstName == null)
            throw new NameUndefinedException();
        if (firstName.length() == 0) {
            System.out.println("\nbrak wprowadzonego imienia - pusty");
            throw new NameUndefinedException();
        }
        if (firstName.length() < 2) {
            System.out.println("\nzbyt krótkie imię");
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException  {
        if (lastName == null){
            throw new NameUndefinedException();
        }
        if (lastName.length() == 0) {
            System.out.println("\nbrak wprowadzonego nazwiska - pusty");
            throw new NameUndefinedException();
        }
        if (lastName.length() < 2) {
            System.out.println("\nzbyt krótkie nazwisko");
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            System.out.print("\nwiek mniejszy od 1 jest niepoprawny");
            throw new IncorrectAgeException();
        }
        if (age > 130) {
            System.out.print("\nwiek większy od 130 jest mało prawodopodobny - sprawdź wiek");
            throw new IncorrectAgeException();
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) throws IncorrectPeselException {
        if (pesel==null) {
            throw new IncorrectPeselException();
        }
        if (pesel.length() == 0) {
            System.out.println("\nbrak wprowadzonego numeru pesel - pusty");
            throw new IncorrectPeselException();
        }
        if (pesel.length() < 11) {
            System.out.println("\nzbyt krótki numer pesel");
            throw new IncorrectPeselException();
        }
        if (pesel.length() > 11) {
            System.out.println("\nzbyt długi numer pesel");
            throw new IncorrectPeselException();
        }
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
