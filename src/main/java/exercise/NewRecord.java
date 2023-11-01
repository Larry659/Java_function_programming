package exercise;

public record NewRecord(String name, String address,Double amount, Integer age) {
    // the initialization of record is same as class
    // record does not have getter or setter method i.e you can only set from the constructor.
    //record is immutable i.e you can not change the value
    // it is advisable for DTO , meaning where you do not need to change values.
}
