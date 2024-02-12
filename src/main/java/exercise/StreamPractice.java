package exercise;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String... args){
//        //System.out.println("I am lanre".toUpperCase());
//
//        List<Student> workingList = generateListOfStudent(20);
//        //Filter Method----takes a predicate
////      List<Student> ageGreaterThan50 =  workingList.stream()
////                .filter(student -> student.getAge()>=50)
////                .collect(Collectors.toList());
////        System.out.println(ageGreaterThan50);
////        System.out.println(ageGreaterThan50.stream().count());
//
//
//        //Map Method--- takes a function
//       List<String> listOfDepartment = workingList.stream()
//               .map(student -> student.getDepartment().toUpperCase())
//               .toList();
//        System.out.println(listOfDepartment);
//
//        //Combining Filter and Map in a stream pipeline
//        List<String> ageGreaterThan50AndUppercaseDepartment =  workingList.stream()
//                .filter(student -> student.getAge()>=50)
//                .map(student -> student.getDepartment().toUpperCase())
//                .toList();
//        System.out.println(ageGreaterThan50AndUppercaseDepartment.stream().count());
//        System.out.println(ageGreaterThan50AndUppercaseDepartment);
//
//
//        //Distinct method---returns distinct instances
//     List<Student> distinctList = workingList.stream()
//                .distinct()
//             .toList();
//        System.out.println(distinctList);
//        //None Match method--- returns boolean
//      Boolean notAMatchAnyDepartment =  workingList.stream()
//                .noneMatch(student -> student.getDepartment().equalsIgnoreCase("CHE"));
//        System.out.println(notAMatchAnyDepartment);
////dropWhile method--- this works like a filter but in a reverse other
//        List<Student> countryNameGreater5 = workingList.stream()
//                .dropWhile(student -> student.getCountry().length() <=5)
//                .toList();
//        System.out.println(countryNameGreater5.stream().count());
//        List<Student> ageGreaterThan50 =  workingList.stream()
//                .filter(student -> student.getAge()>=50)
//                .collect(Collectors.toList());
//        System.out.println(ageGreaterThan50);
//        System.out.println(ageGreaterThan50.stream().count());
//
//        List<Student> ageGreaterThan50Retained = workingList.stream()
//                .takeWhile(student -> student.getAge()>=50)
//                .toList();
//        System.out.println(ageGreaterThan50Retained);

        List<Integer> scores = Stream.of(3,7,10,5,24,15,4,17,34,55,78)
                .sorted()
                .takeWhile(i -> i >= 10)
                .toList();

        System.out.println(scores);

        List<Integer> scores2 = Stream.of(3,7,10,5,24,15,4,17,34,55,78)
                .sorted()
//                .peek(System.out::print)
                .dropWhile(i -> i >= 10)
                .toList();

        System.out.println(scores2);


    }
    static Faker faker = new Faker();

    public static List<Student> generateListOfStudent(int size) {
        List<Student> list = new ArrayList<>();
        for ( int i = 0; i < size; i++) {
            Student st = new Student();
            st.setName(faker.name().firstName());
            st.setState(faker.address().state());
           // st.setCountry(faker.address().country());
            st.setAge(faker.number().numberBetween(10,100));
            st.setDepartment(faker.commerce().department());

            list.add(st);
        }
        return list;
    }
}
