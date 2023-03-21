package binarySearch;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res= new int[2];
        res[0]=findFirstIndex(nums,target);
        res[1]=findLastIndex(nums,target);
        System.out.println(Arrays.toString(res));
    }

    private static int findLastIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid=start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }else{
                end=mid-1;
            }

            if(nums[mid]==target){
                index=mid;
            }
        }
        return index;
    }
    private static int findFirstIndex(int[] nums, int target) {
        int index=-1;
        int start =0;
        int end = nums.length-1;
        int mid;

        while(start<=end) {
            mid = start + (end - start) / 2;
            if(nums[mid]>=target){
                end=mid-1;
            }else{
                start=mid+1;
            }

            if(nums[mid]==target){
                index=mid;
            }
        }
        return index;
    }
}
