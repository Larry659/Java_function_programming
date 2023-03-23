package imperative;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Ade",MALE),
                new Person("Lanre",MALE),
                new Person("Samuel",MALE),
                new Person("Elizabeth",FEMALE),
                new Person("Rachael",FEMALE),
                new Person("Kunle",MALE),
                new Person("folake",FEMALE),
                new Person("gbolahan",MALE)

        );

        System.out.println("///////IMPERATIVE/////////");
        List<Person> maleGender = new ArrayList<>();
        for (Person person:people) {
            if(person.gender.equals(MALE)){
                maleGender.add(person);
            }
        }
        for (Person male:maleGender
             ) {
            System.out.println(male);
        }
        System.out.println("///////DECLARATIVE/////////");
        people.stream()
                .filter((person)->person.gender.equals(MALE))
                .forEach(System.out::println);
    }
    static  class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,
        FEMALE
    }
}
