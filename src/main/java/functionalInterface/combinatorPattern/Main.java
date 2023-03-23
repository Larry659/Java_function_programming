package functionalInterface.combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer1 =
                new Customer( "waleole","wale@gmail.com","+2348109846523", LocalDate.of(1996,06,26));
        CustomerValidatorService validatorService = new CustomerValidatorService();
       // System.out.println(new CustomerValidatorService().validCustomer(customer1));
        System.out.println( "Validation is " + validatorService.validCustomer(customer1));
    }
}
