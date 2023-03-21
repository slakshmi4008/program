package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques63 {
    //Print largest element and smallest element in an array
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
        largestSmallest1(arr);
        largestSmallest2(arr);
    }

    private static void largestSmallest2(int[] arr) {
        System.out.println("Largest and smallest element using loop");
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Largest element in array is " + max);
        System.out.println("Smallest element in array is "+ min);

    }

    private static void largestSmallest1(int[] arr) {

        System.out.println("Largest and smallest element in array using sort function");
        Arrays.sort(arr);
        System.out.println("Largest element is " +arr[arr.length-1]);
        System.out.println("Smallest element is " +arr[0]);
        System.out.println("-----------------------------------");
    }
}
