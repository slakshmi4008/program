package Practice;

import java.util.Arrays;

public class RotateArrayRev {
    public static void main(String[] args) {
        int [] nums ={-1};
        int k=2;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        k =k%nums.length;
        int start =0;
        int end = nums.length-1;
        reverse(nums,start,end);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
            //end--;
            //start++;

        }
    }
}
