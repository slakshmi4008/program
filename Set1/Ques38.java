package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques38 {
    //Print the largest element in the array
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        int[] array = new int[len];
        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        //usingMax(array);
        usingSort(array);
    }

    private static void usingSort(int[] array) {
        int len = array.length;
        Arrays.sort(array);
        System.out.println("The largest element is " +array[len-1]);
        
    }

    private static void usingMax(int[] array) {
        int len= array.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("The largest element is " + max);
    }
}
