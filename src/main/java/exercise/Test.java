package exercise;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//       BankUser bk = new BankUser();
//       bk.setBalance(500.00);
//       bk.setName("lanre balo");
//       bk.setEmail("larryfunmbi26@gmail.com");
//
//       bk.withdraw(350.00);
//        bk.deposit(650.00);
//        String textBlock = """
//                Print a bulleted List:
//                   \u2022first list
//                        \u2022 sub-list"""; // \u2022 is the bulleting
//       // System.out.println(textBlock);
//        int score = 45;
//        String formattedString = String.format("your score is: %f",(float)score);//check documentation for more
//        System.out.printf(formattedString);
//        int[] scores = {1,7,5,8,9,3,2};
//        for (int i = 0; i<= scores.length; i+=2){
//            System.out.println(scores[i]);
//        }

        List<Student> studentList = List.of(
                new Student("lanre",24,"kwara","che"),
                new Student("kunle",34,"ogun","eee"),
                new Student("wale",19,"kogi","mee"),
                new Student("nathan",22,"abuja","cse")
                );
//        for(int i=0; i< studentList.size(); i++ ){
//            System.out.println(studentList.get(i));
//        }
//        for (Student student:studentList) {
//            System.out.println(student.getAge());
//        }
        int value = 2;
        switch(value){

            case 1:
                System.out.println("my name is Lekan");
                break;
            case 2:
                System.out.println("my name is Lanre");
                break;

            case 3:
                System.out.println("my name is Kunle");
                break;
            default:
                System.out.println("I am a robot");
                break;
        }


    }

}
