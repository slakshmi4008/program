package Set1;

import java.util.Scanner;

public class Ques9 {
    // Merge two sorted arrays such that the elements are not repeated

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first array length");
        int l1= sc.nextInt();
        System.out.println("enter first array elements");
        int[] array1 = new int[l1];
        for(int i=0;i<l1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the second array length");
        int l2= sc.nextInt();
        System.out.println("enter second array elements");
        int[] array2 = new int[l2];
        for(int i=0;i<l2;i++){
            array2[i]=sc.nextInt();
        }
        //two pointer method
       mergeArray(array1,array2);


    }
    public static void mergeArray(int[] array1, int[] array2){
        int l1 = array1.length;
        int l2 = array2.length;
        //initialise and declaration
        int i=0;
        int j=0;
        int k=0;
        int[] out = new int [l1+l2];

        while(i<l1&&j<l2){
            if(array1[i]<array2[j]){
            out[k++]=array1[i++];
            }else if(array1[i]>array2[j]){
                out[k++] = array2[j++];
            }else {
                i++;
            }
        }
        //adding remaining elements in array1
        while(i<l1){
            out[k++]=array1[i++];
        }
        //adding remaining elements in array2
        while(j<l2){
            out[k++]=array2[j++];
        }
        //printing the elements in output array
        for(int input :out){
            System.out.print(input +" ");
        }
    }
}
