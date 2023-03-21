package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums ={1,1,1,0};
        int target = -100;
        int sum = threeSumClosest(nums,target);
        System.out.println(sum);
    }

        public static int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);

            int sum=0;
            int ans=0;
            int min=Integer.MAX_VALUE;

            for(int i=0;i<nums.length-2;i++){
                int j=i+1;
                int k=nums.length-1;


                while(j<k){
                    sum=nums[i] + nums[j] +nums[k];

                    if(sum==target){
                        return sum;
                    }else if(sum<target){
                        j++;
                    }else{
                        k--;
                    }
                    if(Math.abs(sum-target)<min)
                    {  System.out.println(Math.abs(sum-target));
                    min=Math.abs(sum-target);
                    ans =sum;}
                }
            }
            return ans;
        }
    }

