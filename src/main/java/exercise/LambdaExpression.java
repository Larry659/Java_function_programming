package exercise;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Student> myStudent = List.of(
                new Student("lanre", 24, "che"),
                new Student("kunle", 34, "eee"),
                new Student("wale", 19, "cse"),
                new Student("lanre", 24, "che")
        );
        List<Student> lessThan20 = myStudent.stream()
                                        .filter(student -> student.getAge() < 20)
                                                .toList();
        System.out.println(lessThan20);
    }
}
