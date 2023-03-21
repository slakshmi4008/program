package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques70 {
//Second largest element

    public static void main(String[] args) {
        //get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();

        int[] arr = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[len-2]);
    }
}
