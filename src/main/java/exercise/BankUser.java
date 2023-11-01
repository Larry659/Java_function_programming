package exercise;

public class BankUser {


    private Double balance;
    private String name;
    private String email;

    public BankUser() {

    }

    public void withdraw(Double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("You withdrew :" + amount + " Your new balance is :" + balance);
        }
        else
            System.out.println("insufficient balance to perform this operation");
    }
    public void deposit(Double amount){

            balance += amount;
            System.out.println("You deposited :" + amount + " Your new balance is :" + balance);
        }

    public BankUser(Double balance, String name, String email) {
        this.balance = balance;
        this.name = name;
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
