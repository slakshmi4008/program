package Set1;

import java.util.Scanner;

public class Ques51 {
    //Reverse the number
    public static void main(String[] args) {
        //get user input
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int reverse=0;

        while(num>0){
            int unitDigit= num%10;
            reverse= (reverse*10)+unitDigit;
            num=num/10;
        }
        System.out.println("The reverse number is " +reverse);
    }
}
