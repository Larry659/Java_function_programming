package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nkechi", "09087654321");
       Customer customer2 =  new Customer("Lanre","08134627864");
       greetCustomer(customer1);
       greetCustomerFunc.accept(customer2);
       greetCustomerWithOrWithoutPhone.accept(customer1,false);
    }
    //Consumer accepts a parameter, but returns nothing
    static Consumer<Customer> greetCustomerFunc = customer ->
            System.out.println("Good morning " + customer.name + " thank you for registering your " + customer.phoneNumber + " with us "
    );
    //Bi-consumer accepts 2 parameter and returns nothing.
    static BiConsumer<Customer,Boolean> greetCustomerWithOrWithoutPhone = (customer,displayNumber)->
            System.out.println("Welcome on board " + customer.name + (displayNumber?customer.phoneNumber:" *****"));
    static void greetCustomer(Customer customer){
        System.out.println("Good morning " + customer.name + " thank you for registering your " + customer.phoneNumber + " with us "
                );
    }
    static class Customer{
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
