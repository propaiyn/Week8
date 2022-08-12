import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PersonMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("Hassan", 22, "Scientist");
        Person person2 = new Person("Rubina", 22, "Quality Scientist");
        Person person3 = new Person("Hinnah", 29, "Consultant");

        // List<Person> people = Arrays.asList(person1, person2, person3);
         List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // Stream<Person> peopleStream = people.stream();

        people.stream()
                .forEach(x -> System.out.println(x)); // print names

        System.out.println("Enter a name: ");             // search names
        String search = scanner.nextLine();
        Person searchPerson = people.stream().filter(x -> x.getName().equalsIgnoreCase(search)).findFirst().get();
        System.out.println(searchPerson);
    }
}
