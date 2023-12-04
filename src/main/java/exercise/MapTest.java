package exercise;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String... args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"lanre");
        students.put(2,"wale");
        students.put(3,"samson");
        students.put(4,"daniel");
        students.put(5,"kunle");
        System.out.println(students.get(3));
        System.out.println(students.containsKey(6));
        System.out.println(students.containsValue("Folake".toLowerCase()));
        System.out.println(students.keySet());
        System.out.println(students.entrySet());
     students.putIfAbsent(6,"wale");
        System.out.println(students.entrySet());
    }
}
