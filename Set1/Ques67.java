package Set1;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Ques67 {
    //duplicate elements
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
        duplicate(arr);
    }

    private static void duplicate(int[] arr) {
        Set<Integer> duplicate = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!duplicate.add(arr[i])){
                System.out.println(arr[i]);
            }

        }
    }
}
