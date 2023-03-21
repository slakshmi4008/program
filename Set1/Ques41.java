package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques41 {
    //copy elements of one Array to another
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

        //usingLoop(arr);
        withoutLoop(arr);
        //System.out.println(Arrays.toString(arr));
    }

    private static void withoutLoop(int[] arr) {
        int len = arr.length;
        int[] arrayCopy =new int[len];
        //System.arraycopy(arr, 0, arrayCopy, 0, len);
        //copying  a subsequence
        //int[] arrayCopy1 =new int[3];
        //System.arraycopy(arr, 2, arrayCopy1, 0, 3);
        //System.out.println(Arrays.toString(arrayCopy1));

        //Arays class method
        arrayCopy=  Arrays.copyOf(arr, len);
        System.out.println(Arrays.toString(arrayCopy));
    }

    private static void usingLoop(int[] arr) {
        int len = arr.length;
        //System.out.println(Arrays.toString(arr));
        int[] arrayCopy =new int[len];
        for(int i=0;i<len;i++){
            arrayCopy[i]=arr[i];
        }
        System.out.println(Arrays.toString(arrayCopy));
    }
}
