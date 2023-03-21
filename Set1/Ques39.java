package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques39 {
    //smallest element in an array
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
        usingMin(array);
        //usingSort(array);
    }

    private static void usingSort(int[] array) {
        int len = array.length;
        Arrays.sort(array);
        System.out.println("The largest element is " +array[0]);

    }

    private static void usingMin(int[] array) {
        int len= array.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("The smallest element is " + min);
    }
}
