package Set1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class
Ques42 {
           //Frequency of elements
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
            usingHashMap(arr);
        }

        private static void usingHashMap(int[] arr) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1);
                }
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+ " " + entry.getValue());
            }
        }
    }

