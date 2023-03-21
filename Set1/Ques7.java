package Set1;

import java.util.Scanner;

public class Ques7 {
    //pattern problem
    public static void main(String[] args) {
        //getting user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        int input = sc.nextInt();

        //withString(input);
        withoutString(input);
    }

    private static void withoutString(int input) {
         int number = input;
         int firstdigit=0;

        //length of the digit
        int n=0;
        while(number!=0){
            n++;
            number=number/10;
        }
        int count=n;

        for(int i=1;i<=n;i++){
            //to find first digit of input integer
            count = Math.max(1,count);
            firstdigit =input/ (int)Math.pow(10,count-1);
            //printing the values
            for(int j=1;j<=n;j++){
                if((i==j)||((i+j)==(n+1))){
                    System.out.print(firstdigit);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            //eg input=123-(1*100)=23 ; input = 23-(2*10)=3;
            input=input-(firstdigit*((int)Math.pow(10,count-1)));
            count--;
        }


    }

    public static void withString(int input ){
        //finding length of the input integer using string
        String str = Integer.toString(input);
        int n = str.length();

        for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if((i==j)||((i+j)==(n+1))){
                        System.out.print(str.charAt(i-1));
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

