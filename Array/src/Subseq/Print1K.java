package Subseq;

import java.util.ArrayList;

public class Print1K {
    public static void main(String[] args) {

        int[] nums = {1,2,1};
        int n= nums.length;
        int k=2;
        int count= printK(0,0,nums,n,k);
        System.out.println(count);
    }
    private static int printK(int index,int sum, int[] nums, int n,int k) {
        if(index==n){
            if(sum==k){
                //System.out.println(list);
                return 1;
            }
            else return 0;
        }
        sum=sum+nums[index];
        int left =printK(index+1,sum,nums,n,k);
        sum=sum-nums[index];
        int right =printK(index+1,sum,nums,n,k);
        return left+right;
    }
}
