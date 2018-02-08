import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonWprowadz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        try {
            System.out.println("Podaj imię osoby: ");
            person.setFirstName(scanner.nextLine());

            System.out.println("Podaj nazwisko osoby: ");
            person.setLastName(scanner.nextLine());

            System.out.println("Podaj wiek osoby: ");
            person.setAge(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Podaj numer pesel osoby: ");
            person.setPesel(scanner.nextLine());

        } catch (NameUndefinedException e) {
            e.printStackTrace();

        } catch (IncorrectAgeException e) {
            e.printStackTrace();

        } catch (IncorrectPeselException e) {
            e.printStackTrace();
        }

        if (person.getFirstName()== null || person.getLastName() == null || person.getAge() <= 0 || (person.getPesel() == null))
            System.out.println("\nWprowadzono dane użytkownika w nieprawidłowy sposób, nie można wyświetlić danych osoby");
        else {
            System.out.println("\nWprowadzona osoba to: ");
            System.out.println(person.toString());
        }
    }
}
