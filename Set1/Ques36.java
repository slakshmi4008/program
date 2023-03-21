package Set1;

import java.util.Scanner;

public class Ques36 {
    //elements present in even position
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
        //printing the elements at odd position
        for(int i=0;i<len;i=i+2){
            System.out.println(array[i]);
        }

    }
}
