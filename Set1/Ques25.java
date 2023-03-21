package Set1;

import java.util.Scanner;

public class Ques25 {
    //Quotient and remainder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the divisor");
        int div =sc.nextInt();

        int quotient =num/div;
        int remainder= num%div;

        System.out.println("quotient is " + quotient);
        System.out.println("remainder is "+ remainder);
    }
}
