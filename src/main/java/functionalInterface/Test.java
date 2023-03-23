package functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("sunkanmi");
        names.add("lanre");
        names.add("shade");
        names.add("rachael");
        List<Integer> ages = new ArrayList<>();
        ages.add(34);
        ages.add(34);
        ages.add(34);
        ages.add(34);
        names.forEach(name-> System.out.println(name));
        System.out.println("///////////////////////////////");
        names.removeIf(name->name.contains("d"));
        names.forEach(name-> System.out.println(name));
    }
}
