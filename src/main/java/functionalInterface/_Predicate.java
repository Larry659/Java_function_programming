package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+2348101877641"));
        //System.out.println(refractorNumber("09023546754"));
        //Test Functional
        System.out.println(validatePhone.test("09022227463"));
        //Test Chaining in Functional
        //The and and or work the same way as && and || but the later can not be used here to call the method!
        System.out.println(validatePhone.and(validatePhoneWith3).test("+2348101877641"));


    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+234") && phoneNumber.length()==14;
    }
    ///Functional Approach
    static Predicate<String> validatePhone = phone->phone.startsWith("+234") && phone.length()==14;
    static Predicate<String> validatePhoneWith3 = phone->phone.contains("3");
//    static String refractorNumber(String phoneNumber){
//        if(phoneNumber.startsWith("+234")){
//            return phoneNumber;
//        }else {
//           return  phoneNumber.replaceFirst("0","+234");
//        }
//    }
}
