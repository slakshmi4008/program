package Set1;

import java.util.Scanner;

public class Ques44 {
    //print dulpicate elements of an array
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        int[] arr = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        prinDuplicateElements(arr);
    }

    private static void prinDuplicateElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
            }
        }
    }
}
