package Set1;

import java.util.Scanner;

public class Ques3 {
    //Difference between number and its reverse

    public static void main(String[] args) {
        //get the input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //initialise
        int num =n;
        int reverse=0;
        int unitDigit=0;
        int difference=0;
        int absoluteDifference=0;

        while(n>0){

            unitDigit=num%10;
            reverse=(reverse*10)+unitDigit;
            n=n/10;

        }
        difference = num-reverse;
        //difference = Math.abs(num-reverse);
        System.out.println(difference);
    }
}
