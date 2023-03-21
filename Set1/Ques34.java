package Set1;

import java.util.Scanner;

public class Ques34 {
    //sum of n natural numbers and largest digit
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

       int sum = (n*(n+1))/2;
       int sumTemp=sum;
       int max=0;

       while(sumTemp!=0){
           int unitDigit = sumTemp%10;
           if(max<unitDigit){
               max=unitDigit;
           }
           sumTemp/=10;
       }
        System.out.println("The sum of " +n +" natural numbers is " + sum);
        System.out.println("The largest digit in the sum is " +max);
    }
}
