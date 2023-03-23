package functionalInterface.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private Boolean isValidEmail(String email){
        return email.contains("@");
    }
    private Boolean isValidPhone(String phone){
        return phone.startsWith("+234");
    }
    private Boolean isValidAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears() > 18;
    }
    public Boolean validCustomer(Customer customer){
        return isValidEmail(customer.getEmail()) && isValidAdult(customer.getDob())
                && isValidPhone(customer.getPhoneNumber());

    }
}
