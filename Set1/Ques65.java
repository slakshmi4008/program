package Set1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques65 {
    //frequency of element
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();

        int[] arr = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        frequency1(arr);
    }

    private static void frequency1(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],(freq.get(arr[i]))+1);
            }else{
                freq.put(arr[i],1);
            }
        }
        System.out.println("Frequency of the element using hashmap");
        System.out.println(freq);
    }
}
