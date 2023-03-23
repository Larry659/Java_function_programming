package functionalInterface;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl("lanre"));
        System.out.println(getDbConnectionUrlSupplier.get());
    }
    //It could return or supply any data type and also an array.
    static Supplier<List<String>> getDbConnectionUrlSupplier = ()-> List.of("jdbc://localhost:5454/users/","jdbc://localhost:5454/workers/") ;
    static String getDbConnectionUrl(String username){

        //It may accept parameter or not
        return "jdbc://localhost:5454/users/" + username;
    }
}
