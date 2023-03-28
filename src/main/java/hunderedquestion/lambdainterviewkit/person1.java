package hunderedquestion.lambdainterviewkit;

import hunderedquestion.Gender;
import hunderedquestion.lambdainterviewkit.Person;

import java.util.ArrayList;
import java.util.List;

public class person1 {
    public static void main(String[] args) {

        List<Person> listPersons = new ArrayList<>();

        listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
        listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
        listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
        listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
        listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
        listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
        listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
        listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
        listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
        listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));



        listPersons.stream().filter(p->p.getGender().equals(Gender.MALE)).forEach(System.out::println);
        listPersons.stream().filter(p->p.getGender().equals(Gender.FEMALE) && p.getAge()<=24).forEach(System.out::println);
        listPersons.stream()
                .map(p -> p.getEmail())
                .forEach(System.out::println);


        listPersons.stream()
                .mapToInt(p -> p.getAge())
                .forEach(age -> System.out.print(age + " - "));

        listPersons.stream().sorted().forEach(s->System.out.println(s.getAge()));

        listPersons.stream().sorted((p1,p2)->p1.getLastName().compareTo(p2.getLastName())).forEach(s->System.out.println(s));

        listPersons.stream()
                .sorted()
                .limit(5)
                .forEach(System.out::println);

        System.out.print("The oldest age: ");
        listPersons.stream()
                .sorted()
                .map(p -> p.getAge())
                .skip(listPersons.size() - 1)
                .forEach(System.out::println);

    }

}
