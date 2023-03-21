package leetcode;

import java.util.Arrays;

public class BinaryFindFirstLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        searchRange(nums,target);

    }

        public static void searchRange(int[] nums, int target) {

            int res[] = new int[2];
            res[0] = findFirst(nums,target);
            res[1] = findLast(nums,target);
            System.out.println(Arrays.toString(res));
        }

        private static int findFirst(int [] nums, int target){
            int index=-1;
            int start =0;
            int end= nums.length-1;
            int mid;

            while(start<=end){
                mid =start+(end-start)/2;
                if(nums[mid]>=target)
                {
                    end=mid-1;
                }else{
                    start=mid+1;
                }

                // it is not else if
                if(nums[mid]==target){
                    index=mid;
                }
            }
            return index;
        }
        private static int findLast(int[] nums,int target){
            int index=-1;
            int start = 0;
            int end =nums.length-1;
            int mid;
            while(start<=end){
                mid =start +(end-start)/2;
                if(nums[mid]<=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }

                //it is not else if
                if(nums[mid]==target){
                    index=mid;
                }

            }
            return index;
        }
    }


