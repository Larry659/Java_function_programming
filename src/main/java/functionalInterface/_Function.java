package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int result = incrementByOne(3);
        System.out.println(result);
        int result2 = incrementByOneFunction.apply(3);
        int valuePlusOneThenTimes10 = addOneThenTimeBy10.apply(4);
        System.out.println(result2);
        System.out.println(valuePlusOneThenTimes10);
        Double hypo = hypothenus.apply(6,8);
        System.out.println(hypo);
    }
    //Function accepts a parameter type and return value type
    static Function<Integer,Integer> incrementByOneFunction = initial_value -> initial_value+ 1;
    static Function<Integer,Integer> multiplyByTen = number-> number * 10;
    //Chaining of functions
    static Function<Integer,Integer> addOneThenTimeBy10 = incrementByOneFunction.andThen(multiplyByTen);
    //Bi-Function(Takes 2 parameter and a return value)
    static BiFunction<Integer,Integer,Double> hypothenus = (adjacent,opposite)->
            Math.sqrt((adjacent*adjacent) +(opposite*opposite));

    static int incrementByOne(int value){
        return value + 1;
    }
}
