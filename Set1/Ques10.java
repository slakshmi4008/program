package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques10 {
    //output array first maximum and first minimum
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first array length");
        int l1= sc.nextInt();
        System.out.println("enter first array elements");
        int[] array = new int[l1];
        for(int i=0;i<l1;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int[] output = new int[l1];

        int i=0;
        int j=l1-1;
        int k=0;

        while(i<j){
            output[k++]=array[j--];
            output[k++]=array[i++];
        }
        if(i==j){
            output[k]=array[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
