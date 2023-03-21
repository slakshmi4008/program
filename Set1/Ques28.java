package Set1;

import java.util.Scanner;

public class Ques28 {
    //odd or even
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        //method1
        ternary(num);
        //method2
        ifElsemethod(num);
        //method3
        usingXOR(num);
        
    }

    private static void usingXOR(int num) {
        if ((num ^ 1) == num + 1)
        {
            System.out.println("The entered number "+ num +" is Even");
        }
        else
        {
            System.out.println("The entered number "+ num +" is Odd");
        }
    }

    private static void ifElsemethod(int num) {
        if(num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    private static void ternary(int num) {
        System.out.println((num%2==0)?"Even":"Odd");
    }
}
