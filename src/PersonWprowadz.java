import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonWprowadz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Podaj imię osoby: ");
        person.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko osoby: ");
        person.setLastName(scanner.nextLine());
        System.out.println("Podaj wiek osoby: ");
        person.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj numer pesel osoby: ");
        person.setPesel(scanner.nextLine());

        System.out.println("\nWprowadzona osoba to: ");
        System.out.println("Imie: " + person.getFirstName());
        System.out.println("Nazwisko: " + person.getLastName());
        System.out.println("Wiek: " + person.getAge());
        System.out.println("Pesel: " + person.getPesel());
    }
}
