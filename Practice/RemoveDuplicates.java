package Practice;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();

        int[] nums = new int[len];

        //receiving input from the user
        System.out.println("Enter the Array elements");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int count =1;
        int k=1;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[k++]=nums[i+1];
            }
        }
        System.out.println(i);
    }

}

