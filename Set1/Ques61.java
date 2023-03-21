package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques61 {
    //print elements of array in reverse order
    public static void main(String[] args) {
        //get input from the user
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        int[] arr = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        printRevArray1(arr);
        printRevArray2(arr);
    }

    private static void printRevArray2(int[] arr) {
        int j = arr.length-1;
        int i = 0;
        while (i < j) {
            for (; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i++]=arr[j];
                arr[j--]=temp;
            }
            System.out.println("Reverse array using swapping");
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void printRevArray1(int[] arr) {
        System.out.println("Reverse array using for loop");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
