package exercise;

public class Test {
    public static void main(String[] args) {
//       BankUser bk = new BankUser();
//       bk.setBalance(500.00);
//       bk.setName("lanre balo");
//       bk.setEmail("larryfunmbi26@gmail.com");
//
//       bk.withdraw(350.00);
//        bk.deposit(650.00);
        String textBlock = """
                Print a bulleted List:
                    \u2022first list
                        \u2022 sub-list"""; // \u2022 is the bulleting
        System.out.println(textBlock);
        int score = 45;
        String formattedString = String.format("your score is: %f",(float)score);//check documentation for more
        System.out.printf(formattedString);
    }
}
