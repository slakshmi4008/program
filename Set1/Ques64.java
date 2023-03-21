package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques64 {
    //copy all elements of one array to another
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
        copyarray1(arr);
    }

    private static void copyarray1(int[] arr) {
        int[] copyArray = new int[arr.length];
        copyArray = arr.clone();
        System.out.println("Copy of array using clone method");
        System.out.println(Arrays.toString(copyArray));
    }
}
