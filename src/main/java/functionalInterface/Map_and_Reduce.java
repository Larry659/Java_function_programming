package functionalInterface;

import functionalInterface.combinatorPattern.Customer;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map_and_Reduce {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
//        //to sum
//        Integer reduceSum = numbers.stream().reduce(0, Integer::sum);
//        System.out.println(reduceSum);
//        //to multiply
//        Integer reduceMultiple = numbers.stream().reduce(1,(a,b)->a*b);
//        System.out.println(reduceMultiple);
        String number = "08101877641";
        System.out.println(number.substring(number.length()-3));

        System.out.println(getEmails());

    }

    public static List<String> getEmails(){
        List<Customer> customers = List.of(new Customer("lanre","larryfunmbi@gmail.com","09131595483", LocalDate.of(1990,10,26)),
                new Customer("kunle","olakunle@gmail.com","0915647829", LocalDate.of(1994,7,24)),
                new Customer("Jide","Oyejide@gmail.com","08043567845", LocalDate.of(1992,11,7))
        );
  return customers.stream().map(Customer::getEmail).collect(Collectors.toList());

        //Another way of writing the above method using imperative approach.
//        List<String> emails = new ArrayList<>();
//        for (Customer customer:customers
//             ) {
//            emails.add(customer.getEmail());
//        }
//       return emails;
   }
}
