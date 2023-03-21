package Set1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques43 {
    //lef trotate
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
        System.out.println("Enter the rotation time");
        int rotationCount= sc.nextInt();
         usingTemp(arr,rotationCount);
    }

    private static void usingTemp(int[] arr,int rotationCount) {
        int count=0;
        int len=arr.length-1;
        while(count<rotationCount) {
            int temp = arr[len];
            for (int i = arr.length-1; i >0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0]=temp;
            count++;
        }
        System.out.println(Arrays.toString(arr));


    }

}
