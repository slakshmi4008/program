package Set1;

import java.util.Scanner;

public class Ques45 {
    //sum of all items of an array
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
        sumOfAllItemsOfAnArray(arr);
    }

    private static void sumOfAllItemsOfAnArray(int[] arr) {
        int sum =0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}
