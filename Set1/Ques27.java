package Set1;

import java.util.Scanner;

public class Ques27 {
    //Swap two numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 =sc.nextInt();

        //swapWithTemp(num1,num2);
        swapWithoutTemp(num1,num2);

    }

    private static void swapWithoutTemp(int num1, int num2) {
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swapping");
        System.out.println(num1);
        System.out.println(num2);
    }

    private static void swapWithTemp(int num1, int num2) {
        int temp=num2;
        num2=num1;
        num1=temp;

        System.out.println("After swapping");
        System.out.println(num1);
        System.out.println(num2);
    }
}
