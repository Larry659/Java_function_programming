package functionalInterface.optional;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {

     Object value = Optional.ofNullable("lanre").orElseGet(()-> "default name");
        System.out.println(value);

        Optional.ofNullable("john@gmail.com").ifPresent((email)-> System.out.println("sending email to " + email));
        Optional.ofNullable(null)//try to insert an email
                .ifPresentOrElse((email)-> System.out.println("Sending email to " + email),()-> System.out.println("Unable to send email"));
    }

}
