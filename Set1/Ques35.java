package Set1;

import java.util.Scanner;

public class Ques35 {
    //factorial of a number and the factorial number's sum of its digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        withoutRec(n);

    }

    private static void withoutRec(int n) {
        int fact = 1;
        int sumOfDigits=0;
        if (n == 0 || n == 1) {
            System.out.println("The factorial of the number " + n + " is 1");
            return;
        }
        for(int i=1;i<=n;i++) {
            fact = fact * i;

        }
        System.out.println("The factorial of the number " + n + " is " + fact);

        while(fact!=0){
            int unitDigit= fact%10;
            sumOfDigits+=unitDigit;
            fact/=10;
        }
        System.out.println("The factorial's sum of the digits is " +sumOfDigits);
    }
}
