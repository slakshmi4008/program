package Set1;

import java.util.Scanner;

public class Ques32 {
    //positive or negative
    public static void main(String[] args) {
      Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
      int n = sc.nextInt();

      String res = (n>0)?"Positive number":"Negative Number";
        System.out.println(res);

    }
}
