package Set1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques62 {
    //print elements present in odd and even position
    public static void main(String[] args) {
        //get user input
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        int[] arr = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        elementsAtOddEven1(arr);
        elementsAtOddEven2(arr);
    }

    private static void elementsAtOddEven2(int[] arr) {
        System.out.println("Elements present in even position using bitwise AND");
        for(int i=0;i<arr.length;i++) {
            if ((i & 1) == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Elements present in odd position using bitwise AND");
        for(int i=0;i<arr.length;i++){
            if((i & 1) != 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }



    private static void elementsAtOddEven1(int[] arr) {
        System.out.println("Elements present in even position using modulo operator");
        for(int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
            System.out.println("Elements present in odd position using modulo operator");
            for(int i=0;i<arr.length;i++){
                if(i%2!=0){
                    System.out.print(arr[i] + " ");
                }
            }
        System.out.println();
    }

}
