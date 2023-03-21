package Subarray;

import java.util.HashSet;

public class FindSubArraysWithequalSum {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println(findSubarrays(nums));
    }

        public static boolean findSubarrays(int[] nums) {
            int[] sum =new int[nums.length+1];
            sum[0]=0;
            int total=0;
            HashSet<Integer> set =new HashSet<Integer>();

            for(int i=1;i<sum.length;i++){
                sum[i]=sum[i-1]+nums[i-1];
            }
            for(int i=0;i<sum.length;i++){
                for(int j=i+2;j<sum.length;j++){
                    total=sum[j]-sum[i];
                    if(!set.add(total))
                        return true;
                }
            }
            return false;

        }
    }

