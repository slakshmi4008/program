package Set1;

import java.util.Scanner;

public class Ques30 {
    //Largest among three numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 =sc.nextInt();
        System.out.println("enter the third number");
        int num3 =sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("lasgest number is " +num1);
            }else{
                System.out.println("largest number is " + num3);
            }
        }else{
            if(num2>num3){
                System.out.println("lasgest number is " +num2);
            }else{
                System.out.println("largest number is " + num3);
            }

        }
//method 2 using ternary
        int res = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        System.out.println("Largest number using ternary operator is " +res);
    }
}
